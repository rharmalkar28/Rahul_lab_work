package elevatorStimulation;

import java.util.Scanner;

public class working {

	public static void main(String[] args) throws InterruptedException {
		int reqFlor , status,ch=0 ,curtFloor;

		Scanner readnum = new Scanner(System.in);
		requestElevator el1 =new requestElevator();
		panel Panel = new panel();

		el1.setStatus(3); 
		
		while(ch==0){
			curtFloor = Panel.outSidePanel();
			el1.elevatorCall(curtFloor);
			
			reqFlor=Panel.inSidePanel();
			
			status=el1.getStatus();
		
			System.out.println("Elevator at " +el1.callElevator(reqFlor,status));
		}
		
	}

}
