package problem1;
//You purchase an item online, you want different payment methods such as credit card, debit card, net-banking or cash on delivery
public class EComsite {

	public String PaymentMode;
	
	private String commonPs(String PaymentMode) {
		this.PaymentMode = PaymentMode;
		
		switch (PaymentMode) {
		case "COD":
			cashOnDelivery cod = new cashOnDelivery();
			
			return cod.varification();
		
			//break;
			
		case "creditCard":
			creditCard cc = new creditCard();
			return cc.varification();
			
			
			//break;
			
		case "debitCard":
			debitCard dc = new debitCard();
			return dc.varification();
			
			//break;
			
		case "netBanking":
			netBanking nb =new netBanking();
			return nb.varification();
			
			//break;

		default:
			return null;
			//break;
		}
	}

	
	public String chosePaymentMethod(String PaymentMode) {
		// TODO Auto-generated method stub
		
		return commonPs(PaymentMode);
		
		
	}


	public double makePayment(double price , int qty ) {
		// TODO Auto-generated method stub
		double totalCost;
		boolean status=false;
		totalCost = price*qty;
		
		switch (PaymentMode) {
		case "COD":
			cashOnDelivery cod = new cashOnDelivery();
			status=cod.paymentProcess(totalCost);
		
			break;
			
		case "creditCard":
			creditCard cc = new creditCard();
			status=cc.paymentProcess(totalCost);
			
			
			break;
			
		case "debitCard":
			debitCard dc = new debitCard();
			status= dc.paymentProcess(totalCost);
			
			break;
			
		case "netBanking":
			netBanking nb =new netBanking();
			status=nb.paymentProcess(totalCost);
			
			break;

		default:
			
			break;
		}
		
		if(status == true)
			return totalCost;
		else
			return -1;
	}
	
	

}
