package elevatorStimulation;

public class requestElevator extends elevator {

	public void elevatorCall(int currentFloor){
		int status,elevatorPosition;
		status = getStatus();
		elevatorPosition = callElevator(currentFloor,status);
		if(elevatorPosition == -1){
		System.out.println("Elevator at " + currentFloor);
		}else{
			System.out.println("Elevator at " + elevatorPosition);
		}
	}
}
