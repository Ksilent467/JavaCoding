package Questions;

import java.util.*;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number till series you want: ");
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++)
		{
		System.out.print(recFibonacci(i) + " ");
		}
		//fibonacci(x);
	}
	
//	public static void fibonacci(int x) 
//	{
//		if(x==0||x==1)
//		{
//			System.out.println("0");
//		}
//		else if(x==2)
//		{
//			System.out.println("0 "+"1");
//		}
//		else
//		{
//		int a=0;
//		int b=1;
//		int t=0;
//		for(int i=0;i<x;i++)
//		{
//			System.out.print(b +" ");
//			t=b;
//			b=a+b;
//			a=t;
//		}
//		}
//	}
	
	
	public static int recFibonacci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
			return recFibonacci(n-1)+recFibonacci(n-2);
	}
		
}
