package car;

public class Part implements Car {
	
	String Name;
	double price;

	public Part(String partName, double price) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.Name=partName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}