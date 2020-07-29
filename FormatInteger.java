/*
Author:			Christian Harris
Date:			29 July 2020
Description:	This program formats an integer as a string with a fixed width padded with leading zeroes.
*/

import java.util.Scanner;

public class FormatInteger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = in.nextInt();
		
		System.out.print("Enter a width: ");
		int width = in.nextInt();
		
		System.out.print(format(number, width));
	}
	//This method converts an integer number to a string and padds the length of the string with leading zeroes to hold a width number of characters
	public static String format(int number, int width){
		String s = Integer.toString(number);
		while(s.length() < width){
			s = "0" + s;
		}
		return s;
	}
}