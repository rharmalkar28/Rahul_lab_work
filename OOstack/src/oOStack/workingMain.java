package oOStack;

public class workingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean completed ;
		//stackUsingList stackI =  new stackImplementation(7);
		stackUsingList stackI =  new stackUsingLinkList();
		//stackUsingList stackI =  new stackUsingList();
		
		stackI.displyS();
		
		stackI.pushS(4);
		stackI.pushS(6);
		stackI.pushS(5);
		stackI.pushS(3);
		stackI.pushS(2);
		stackI.pushS(1);
		stackI.pushS(9);
		completed =stackI.pushS(9);
		if(completed==false){
			System.out.println("Stack is full");
		}
		stackI.displyS();
		completed=stackI.popS();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackI.displyS();
		/*
		stackUsingList stackList = new stackUsingList();
		System.out.println("-------Stack implementation using Arrey list------");
		stackList.displyS();
		stackList.pushS(5);
		stackList.pushS(6);
		stackList.pushS(8);
		stackList.pushS(9);
		stackList.displyS();
		
		completed =stackList.popS();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackList.displyS();
		
		
		stackUsingLinkList stackLink = new stackUsingLinkList();
		System.out.println("-------Stack implementation using link list------");
		stackLink.displyS();
		stackLink.pushS(4);
		stackLink.pushS(5);
		stackLink.displyS();
		completed =stackLink.popS();
		
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackLink.displyS();
		*/
	}

}
