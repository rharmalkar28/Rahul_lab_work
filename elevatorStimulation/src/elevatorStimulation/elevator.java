package elevatorStimulation;

public class elevator {

	private int status=0;
	DisplyPanel displyPanel = new  DisplyPanel();
	Doors door =new Doors();
	
	private int callElevatorUp(int reqFloor) {
		for(int i=status;i<=reqFloor;i++){
			this.status=i;
			if(i != reqFloor)
				displyPanel.printElevatorMovingUp(status);
		}
		door.openDoor();
		return this.status;
		
	}
	
	private int callElevatorDown(int reqFloor){
		for(int i=status;i>=reqFloor;i--){
			this.status=i;
			if(i != reqFloor)
				displyPanel.printElevatorMovingDown(status);
		}
		door.openDoor();
		return this.status;
	}
	
	public int callElevator(int reqFloor, int status ) {
		if(status==reqFloor){
			return -1;
			
		}else
		{
			door.closeDoor();
			if(status<reqFloor){
				return callElevatorUp(reqFloor);
			}
			else{
				return callElevatorDown(reqFloor);
			}
		}
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
