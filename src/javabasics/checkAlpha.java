package javabasics;

import java.util.Scanner;

public class checkAlpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		boolean result=checkAlpha(ch);
		System.out.println(result);
	}
	public static boolean checkAlpha(char alph)
	{
		if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u')
		{
			return true;
		}
		return false;
	}

}
