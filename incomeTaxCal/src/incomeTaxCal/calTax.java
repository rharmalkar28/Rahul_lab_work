package incomeTaxCal;

public class calTax implements incomeTax {
	double amtt;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		amtt = (amt*30)/100;
		return amtt;
	}

}
