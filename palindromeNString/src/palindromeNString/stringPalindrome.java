package palindromeNString;

import java.util.ArrayList;
import java.util.Scanner;

public class stringPalindrome {

	private static Scanner scr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words;
		String[] plidromeWds ;
		scr = new Scanner(System.in);
		System.out.println("Enter The String To find Palindrome ");
		words = scr.nextLine();
		//= new String[words.length()] ;
		StringFunction sf = new StringFunction();
		plidromeWds=sf.IsPalindrome(words);

		/*
		for(int i=0;i<=plidromeWds.length;i++){
			System.out.println(plidromeWds[i]);
		}
*/
	}

}