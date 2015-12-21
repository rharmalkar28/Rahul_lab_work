package oOStack;

public class stackImplementation {
	private int n=5;
	private int top = -1 ;
		
	public stackImplementation(int n) {
		super();
		this.n = n;
	}
	
	private int Storage[] = new int[n] ;

	public boolean pushS(int num){

		if(top == (n - 1)){
			return false;
		}
		else{
			Storage[++top]=num;
		}
			
		
		return true;
	}
	
	public boolean popS(){
		
		if(top == -1){
			return false;
			
		}
		else{
			top--;
		}
		
		return true;
	}
	
	public void displyStack(){
		System.out.print("the stack is ");
		
		if(top == -1){
			System.out.print("empty");
		}
		
		for(int i=0;i<=top ;i++){
			System.out.println(Storage[i] + "\t");
		}
	}
}