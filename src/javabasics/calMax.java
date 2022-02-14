package javabasics;

import java.util.Scanner;

public class calMax {
	public static int calMax(int x,int y, int z)
	{
		return x>y?((x>z)?x:z):((y>z)?y:z);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=calMax(a,b,c);
		System.out.println(result);
	}

}
