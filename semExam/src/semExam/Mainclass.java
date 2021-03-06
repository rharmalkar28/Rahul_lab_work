package semExam;

public class Mainclass {

	public static void main(String[] args)
	{
		Server s1 = new Server("Panajim-counter");
		client counter1 = new client("margao");
		client counter2 = new client("mapusa");
		client counter3 = new client("phoda");
		
		s1.setResult(400); /*1. There is one Result Server which keeps the results and notifies the clients when any update is made to result*/
		
		s1.AddObserver(counter1); //adds the observer counter1 
		s1.AddObserver(counter2); //adds the observer counter2 
		s1.AddObserver(counter3); //adds the observer counter3
		s1.updateResult(); /*3. There are three result display clients that subscribe to result service*/
		
		s1.setResult(counter1.SendResult(500),counter1); /*2. There is one counting station client which send the latest result to server to change its result*/		
		/*5. One of the display client leaves the service*/
		s1.RemoveObserver(counter1);
		s1.updateResult();
		
		/*4. Counting station sends some intermediate result that results in update of display in display clients */
		s1.setResult(counter2.SendResult(600),counter1);
		
		s1.updateResult();
		
		/*6. Another set of result is sent to server that results in change in display of clients subscribed at that time.*/
		s1.setResult(800);
		s1.updateResult();
		
	}
}
