/*
Author:			Christian Harris
Date:			29 July 2020
Description:	This program displays a nxn matrix of random 1 and 0 entries to the console. n is determined by a user prompt.
*/

import java.util.Scanner;

public class DisplayMatrix{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		printMatrix(n);
	}
	//This method prints an nxn matrix of random 1 and 0 entries to the console.
	public static void printMatrix(int n){
		String s = "";
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				s = s + (int)(Math.random()*2) + " ";
			}
			s = s + "\n";
		}
		System.out.print(s);
	}
}