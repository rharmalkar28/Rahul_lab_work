package oOStack;

public class workingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean completed ;
		stackImplementation stackI = new stackImplementation(7);
		
		stackI.displyStack();
		
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
		stackI.displyStack();
		completed=stackI.popS();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackI.displyStack();
		
		stackUsingList stackList = new stackUsingList();
		System.out.println("-------Stack implementation using Arrey list------");
		stackList.disply();
		stackList.pushIn(5);
		stackList.pushIn(6);
		stackList.pushIn(8);
		stackList.pushIn(9);
		stackList.disply();
		
		completed =stackList.popOut();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackList.disply();
		
		
		stackUsingLinkList stackLink = new stackUsingLinkList();
		System.out.println("-------Stack implementation using link list------");
		stackLink.disply();
		stackLink.addS(4);
		stackLink.addS(5);
		stackLink.disply();
		completed =stackLink.removeS();
		
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackLink.disply();
	}

}
