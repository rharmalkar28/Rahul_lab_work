package semExam;

public class client implements Observer {
	int result;
	String name;
	
	public client(String string) {
		this.name = string;
	}

	public String getName(){
		return name;
	}
	public void Update(int result)
	{
		System.out.println("result update!!!");
		System.out.println(result);
	}
	
	public int SendResult(int result)
	{
		System.out.println("send latest result!!!");
		return result;
	}
	

}
