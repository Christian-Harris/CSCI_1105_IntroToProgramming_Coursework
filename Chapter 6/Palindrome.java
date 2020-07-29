/*
Author:			Christian Harris
Date:			29 July 2020
Description:	This program tests to see if an integer is a palindrome.
*/

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer value: ");
		int input = in.nextInt();
		
		if(isPalindrome(Math.abs(input))){
			System.out.println(input + " is a palindrome.");
		}
		else{
			System.out.println(input + " is not a palindrome.");
		}
	}
	//reverse reads an integer value and returns an integer value with the digits reversed.
	public static int reverse(int number){
		int n = 0;
		while(number != 0){
			int digit = number % 10;
			n = ((n * 10) + digit);
			number /= 10;
		}
		return n;
	}
	//isPalindrome reads an integer value and returns a boolean value depending on whether or not the integer is a palindrome.
	public static boolean isPalindrome(int number){
		return (number == reverse(number));
	}
}