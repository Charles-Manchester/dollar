// @author Charles Manchester

import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmailMerge {
	public static String s;
	public static String line = "";
	public static String returnValue = "";
	
	public static void main(String[] args) {
		Scanner sc = null;
		FileReader reader = null;
		FileWriter writer = null;
		try{
			sc = new Scanner(new File("people.txt"));
		}	
		catch(IOException e) {
			System.out.println(e);
		}
		
		while(sc.hasNextLine()) {
			Scanner sc2 = new Scanner(sc.nextLine());
			List<String> name = new ArrayList<String>();
				//First we want to get a persons data from the people file - Name, Age, and Gender
			while(sc2.hasNext()) {
				int j=0;
				for(int i = 0; i < 3; i++){
					name.add(sc2.next());
				}
				
				//Now we'll copy the template file into a new, but not yet personalized file
				String letterName = name.get(0);
				int letterNumber = 1;
				File source = new File("C:\\Users\\charles\\workspace\\assg1\\template.txt");
				
				//Before we make a new template, we'll have to check if another person with the same name already exists
				File test = new File("C:\\Users\\charles\\workspace\\assg1\\" + letterName + ".txt");
				//If it does, we'll have to make a new file name, but not a new person name!
				if(test.exists()){
					letterName = name.get(0) + letterNumber;
					File dest = new File("C:\\Users\\charles\\workspace\\assg1\\" + letterName + ".txt");
					try{
						Files.copy(source.toPath(), dest.toPath());
						Path path = Paths.get("C:\\Users\\charles\\workspace\\assg1\\" + letterName + ".txt");
						String content = new String(Files.readAllBytes(path));
						content = content.replaceAll("name", name.get(0));
						content = content.replaceAll("age", name.get(1));
						content = content.replaceAll("gender", name.get(2));
						Files.write(path, content.getBytes());
					}
					catch(IOException e) {
						System.out.println(e);
					}
				}
				//If the file doesn't exist we can go ahead with the replacements
				else{	
					File dest = new File("C:\\Users\\charles\\workspace\\assg1\\" + letterName + ".txt");
					try{
						Files.copy(source.toPath(), dest.toPath());
						Path path = Paths.get("C:\\Users\\charles\\workspace\\assg1\\" + letterName + ".txt");
						String content = new String(Files.readAllBytes(path));
						content = content.replaceAll("name", name.get(0));
						content = content.replaceAll("age", name.get(1));
						content = content.replaceAll("gender", name.get(2));
						Files.write(path, content.getBytes());
					}
					
					catch(IOException e) {
						System.out.println(e);
					}
				}
				j++;
			
			}
		}
	}

}
