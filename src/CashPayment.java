// @author Charles Manchester

public class CashPayment extends Payment {
	
	public CashPayment(double payment) {
		super(payment);
	}

	//Method which prints the details of the payment
	public void paymentDetails(){
		System.out.println("The cash payment is " + paymentAmt);
	}

}
