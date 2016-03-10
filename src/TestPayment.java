// @author Charles Manchester

public class TestPayment {

	public static void main (String[] args){

		CashPayment cash1 = new CashPayment(100); 
		CashPayment cash2 = new CashPayment(100);
		CashPayment cash3 = new CashPayment(200);
		CashPayment cash4 = new CashPayment(200);
		CreditCardPayment credit1 = new CreditCardPayment(100, "Fred", "10/5/2010", "123456789");
		CreditCardPayment credit2 = new CreditCardPayment(100, "Barney", "11/15/2009", "987654321");
		CreditCardPayment credit3 = new CreditCardPayment(200, "Wilma", "12/12/20011", "129384756");
		System.out.println("Cash 1 details:");
		cash1.paymentDetails();
		System.out.println();
		System.out.println("Cash 2 details:");
		cash2.paymentDetails();
		System.out.println();
		System.out.println("Cash 3 details:");
		cash3.paymentDetails();
		System.out.println();
		System.out.println("Cash 4 details:");
		cash4.paymentDetails();
		System.out.println();
		System.out.println("Credit 1 details:");
		credit1.paymentDetails();
		System.out.println();
		System.out.println("Credit 2 details:");
		credit2.paymentDetails();
		System.out.println();
		System.out.println("Credit 3 details:");
		credit3.paymentDetails();
		System.out.println();
		if (cash2.equals(cash1)){
			System.out.println("cash2 and cash1 are equal");
			}
		if (cash2.equals(credit1)){
			System.out.println("cash2 and credit1 are equal");
		}
		if (credit1.equals(credit2)){
			System.out.println("credit2 and credit1 are equal");
		}
		if (cash3.equals(cash4)){
			System.out.println("cash3 and cash4 are equal");
		}
		if (cash3.equals(credit3)){
			System.out.println("cash3 and credit3 are equal");
		}
	}
	
}
