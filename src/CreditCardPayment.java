// @author Charles Manchester

public class CreditCardPayment extends Payment{
	private String name;
	private String expiration;
	private String number;
	
	public CreditCardPayment(double payment, String cardName, String cardExpiration, String cardNumber) {
		super(payment);
		name = cardName;
		expiration = cardExpiration;
		number = cardNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public String getExpiration(){
		return expiration;
	}
	
	public String getNumber(){
		return number;
	}
	
	//Method which prints the details of the payment
	public void paymentDetails(){
		System.out.println("The credit card payment amount is " + paymentAmt);
		System.out.println("The name on the card is: " + name);
		System.out.println("The expiration date is: " + expiration);
		System.out.println("The credit card number is: " + number);
	}
	
}
