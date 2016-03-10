
public class Payment {
	protected double paymentAmt; 	
	
	public Payment(double payment) {
		paymentAmt=payment;
	}
	
	/*
	* Method which checks if two payments are equal in amount
	* @param otherObject The object to be compared
	* @return boolean Returns true or false- true if objects are equal, false if otherwise
	*/
	public boolean equals (Object otherObject) {
	    if (otherObject == null)
	       return false;
	    else if (getClass() != otherObject.getClass())
	       return false;
	    else {
	       Payment otherPayment = (Payment)otherObject;
	       return (paymentAmt == otherPayment.getPaymentAmt());
	    }
	  }
	
	//Method which prints the payment details
	public void paymentDetails(){
		System.out.println("The payment amount is " + getPaymentAmt());
	}
	
	public double getPaymentAmt(){
		return paymentAmt;
	}

}
