package testFactory;

public class client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory Factory = new factory(); //method used by client to instantiate new object
		
		Message msg1 = Factory.getMessage("whatsapp");
		
		msg1.sendMessage("9087654312", "Meet me urgently");
		
		Message msg2 = Factory.getMessage("Hike");
		
		msg2.sendMessage("7712321542", "Having any Trouble??");
		
		
	}
	
}
