package oOStack;

import java.util.LinkedList;

public class stackUsingLinkList extends stackUsingList {
	
	LinkedList<Integer> link1 = new LinkedList<Integer>();

	public boolean pushS(int num){
		link1.add(num);
		return true;
	}
	
	public boolean popS(){
		if(link1.isEmpty()){
			return false;
		}else{
			link1.removeLast();
			return true;
		}
	}
	
	public void displyS (){
		if(link1.isEmpty()){
			System.out.println("link list is empty");
		}else{
			System.out.println(link1);
		}
	}
}
