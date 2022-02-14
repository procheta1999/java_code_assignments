package javabasics;

import java.util.Scanner;

public class calInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int amount=sc.nextInt();
		double result=calInterest(amount);
		System.out.println(result);
	}
	public static double calInterest(int amt)
	{
		double result=1.0;
		if(amt<=1000)
		{
			result=(amt*4.0*1.0)/100;
		}
		else if(amt>1000 && amt<=5000)
		{
			result=(amt*4.5*1.0)/100;
		}
		else
		{
			result=(amt*5.0*1.0)/100;
		}
		return result;
	}

}
