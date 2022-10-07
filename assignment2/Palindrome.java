package assignment2;

import java.util.*;

public class Palindrome {

	public static boolean isPalindrome(Stack stack) throws Exception {
		
		char[] reverseArr = new char[stack.getSize()];
		for(int i= 0; i < stack.getSize(); i++) {
			reverseArr[i] = stack.pop();
		}
		
		return (Arrays.equals(reverseArr,stack.getArrStack())) ? true : false;
	}
	
	public static String scanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void main(String[] args) throws Exception{
		
		String givenString = scanner();
		
		Stack stack = new Stack(givenString);
		char[] input = givenString.toLowerCase().toCharArray();
		
		for(int i = 0; i < stack.getSize(); i++) {
			stack.push(input[i]);
		}
		
		try {
			if(isPalindrome(stack)) {
				System.out.print(givenString + " is a palindrome.");
			}else {
				System.out.print(givenString + " is not a palindrome.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
				
	}

}