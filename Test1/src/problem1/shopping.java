package problem1;
/*
 * 
You purchase an item online, you want different payment methods such as credit card, debit card, net-banking or cash on delivery.

Write a program that assumes that you have made a purchase of an item and allows you to select a payment method and makes the payment.

It should be possible to select any payment method for a successive transactions with minimum changes to the code.



We need an OO solution to this problem.

You are not supposed to program for selecting an item etc. Assume that you have purchased an item Y with a price X.

 */


public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//assume that item details such as price are defined in class Item.

			String PaymentMode;
			double Success;
			Item item1= new Item();
			
			PaymentMode = "creditCard";//get payment mode
			
			item1.setName("Java Book");
			item1.setPrice(10.00);
			item1.setQty(5);
			
			EComsite flipKart = new EComsite();

			System.out.println("Payment is been Choose throught "+PaymentMode);
			flipKart.chosePaymentMethod(PaymentMode); //payment method choosen and some sort of verification done 

			//X specifies the chosen method
						
			Success = flipKart.makePayment(item1.getPrice(),item1.getQty()); //actual process of payment by connecting to the choosen method 

			if(Success == -1)
				System.out.println("Payment Failed throught "+PaymentMode);
				
			else{
				System.out.println("The Total cost is "+Success +" of item "+item1.getName());
				System.out.println("got done throught "+PaymentMode);
			}
			//similarly you can show different payment method for different items…

	}
}
