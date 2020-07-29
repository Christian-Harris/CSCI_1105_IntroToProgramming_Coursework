/*
Author:			Christian Harris
Date:			27 July 2020
Description:	This program reads in a users three digit integer and tests to see whether or not the integer is a palindrome.
*/

import java.util.Scanner;

public class PalindromeInteger
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number you would like to test: ");
		int value = input.nextInt();
		
		int hundreds = value / 100;
		int tens = (value % 100) / 10;
		int ones = value % 10;
		
		int reverse = (ones * 100) + (tens * 10) + hundreds;
		
		if(value == reverse)
		{
			System.out.println("This is a palindrome.");
		}
		else
		{
			System.out.println("This is not a palindrome.");
		}
	}
}