package elevatorStimulation;

public class requestElevator extends elevator {

	public void elevatorCall(int currentFloor){
		int status;
		status = getStatus();
		System.out.println("Elevator at " +callElevator(currentFloor,status));
		System.out.println("Opening Doors");

	}
}
