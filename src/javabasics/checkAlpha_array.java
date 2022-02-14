package javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class checkAlpha_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		boolean result=checkAlpha(ch);
		System.out.println(result);
	}
	public static boolean checkAlpha(char alph)
	{
		char vowelArray[]={'a','e','i','o','u','A','E','I','O','U'};
		for(char ch:vowelArray)
		{
			if(ch==alph)
			{
				return true;
			}
		}
		return false;
	}

}
