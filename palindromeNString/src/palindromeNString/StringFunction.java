package palindromeNString;


public class StringFunction {
	String[] palindromeWords;
	public String[] IsPalindrome(String sWord){
		palindromeWords = new String[sWord.length()];
		String temp,temp2,temp3;int k=0;
		temp=sWord;
		
		for(int i=1;i<= temp.length();i++){
			
			temp2 =(String) temp.subSequence(0, i);
			StringBuilder temp1 = new StringBuilder();
			temp1.append(temp2);
			temp3=temp1.reverse().toString();
			
			if(temp2.toString().equals(temp3) ){
				palindromeWords[k]=temp2.toString();
				k++;
				System.out.println("The palindrome words in a String "+temp2.toString());
			}

		}

		return palindromeWords;
	}

}