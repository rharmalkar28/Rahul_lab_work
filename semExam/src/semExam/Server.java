package semExam;

import java.util.*;
import java.util.ArrayList;

public class Server implements Subject {
	private int result;
	private String name;
	
public int getResult()
{
	return result;
}

public void setResult(int data){
	this.result = data;
}

public void setResult(int data,Observer o){
	System.out.println("The counter "+o.getName() +" has updated result "+data);
	this.result = data;
}

private ArrayList<Observer> observers;

public Server (String name)
{
	super();
	this.name = name;
	observers = new ArrayList<Observer>();
}

public void updateResult()
{
	NotifyObservers();
}

public void AddObserver(Observer o)
{
	observers.add(o);
}

public void RemoveObserver(Observer o)
{
	String cName = observers.get(0).getName();
	System.out.println("The Removed Counter is " +cName);
	observers.remove(o);
}

public void NotifyObservers()
{
	for(int i=0; i<observers.size();i++)
	{
		
		String cName = observers.get(i).getName();
		System.out.println(cName);
		observers.get(i).Update(getResult());
	}
}
}

