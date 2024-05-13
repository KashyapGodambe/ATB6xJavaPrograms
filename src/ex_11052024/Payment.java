package ex_11052024;

public class Payment {
	
	//Attributes
	String paymentType;
	String paymentMode;
	int paymentId;
	boolean ispaymentDone;
	
			
					
					
	//behaviour
	boolean printInvoice(boolean ispaymentDone)
	{
		System.out.println("Invoice of payment is printed!!!");
		return ispaymentDone;
	}
	

}
