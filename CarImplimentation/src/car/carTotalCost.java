package car;

public class carTotalCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalCost ; 
		Subsystem car =new Subsystem("car");
		
		car.aadPart(new Part("test1",29.00));
		car.aadPart(new Part("test2",80.00));
		car.aadPart(new Part("test3",75.00));
		car.aadPart(new Part("test4",50.50));
		car.aadPart(new Part("test5",100.50));
		car.aadPart(new Part("test6",30.00));
		
		totalCost=car.getPrice();
		System.out.println("The Price is "+totalCost);

	}

}
