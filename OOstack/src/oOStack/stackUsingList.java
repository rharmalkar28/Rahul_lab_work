package oOStack;

import java.util.ArrayList;

public class stackUsingList  {
	
	int top=-1;
	ArrayList<Integer> lStack = new ArrayList<Integer>();
	
	public boolean pushS(int num){
		lStack.add(num);
		top++;
		return true;
	}
	
	public boolean popS(){
		if(lStack.isEmpty()){
			return false;
		}
		else{
			lStack.remove(top);
			return true;
		}
	}
	
	public void displyS(){
		if(lStack.isEmpty()){
			System.out.println("Arrey list is empty");
		}
		else
			System.out.println(lStack);
		
	}

}