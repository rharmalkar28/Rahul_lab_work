package compilerTest;

import java.util.Scanner;

public class graph1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int arr[][] =new int[3][2];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=1;
		arr[1][1]=2;
		arr[2][0]=1;
		arr[2][1]=2;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter The Binary String");
		str = s1.nextLine();
		
		System.out.println("the graph arrey is");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		int l=0;int c;
		char m;
		
		for(int k=0;k<str.length();k++){
			m=str.charAt(k);
			c=Character.getNumericValue(m);//conversion from char to integer
			l=arr[l][c];
		}
		
		if(l==2){
			System.out.println("The Patten is DFA");
		}else{
			System.out.println("The Patten is not DFA");
		}
		
		

	}

}
