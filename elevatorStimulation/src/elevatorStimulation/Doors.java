package elevatorStimulation;

public class Doors {
	
	private boolean door=false;
	
	public void openDoor(){
		door=true;
		System.out.println("Door Openning ");
	}
	
	public void closeDoor(){
		door=false;
		System.out.println("Door Closing ");
	}
	

}
