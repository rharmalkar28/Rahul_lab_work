package ShopingPkg;

public class debitCard implements paymentMethod {

	@Override
	public double makePayment(double price, int qty) {
		// TODO Auto-generated method stub
		return price*qty;
	}

}
