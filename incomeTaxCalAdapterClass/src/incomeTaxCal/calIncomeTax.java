package incomeTaxCal;

public class calIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payTax;
		//incomeTax tax = new calTax(); //old system
		incomeTax tax = new catTaxAdapter();
		payTax=tax.calculate(50000.00);
		
		System.out.println("the tax payment of Rs "+payTax +" need to pay");

	}

}
