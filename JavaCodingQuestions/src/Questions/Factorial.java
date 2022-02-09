package Questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("1.Regular Method");
		System.out.println("2.Recursion Method");
		System.out.println("You want to find via Recursion or Regular Method?");
		int m=sc.nextInt();
		
		switch(m)
		{
		case 1: System.out.println(fact(n));
		break;
		
		case 2: System.out.println(recFact(n));
		break;
		
		default: System.out.println("Invalid choice!");
		}

	}
	
	public static int fact(int n)
	{
		System.out.println("Regular Method:");
		int f=1;
		if(n==0||n==1)
			return 1;
		else
		{
			while(n>1)
			{
				f=f*n;
				n--;
			}
			return f;
		}
		
	}
	
	public static int recFact(int n)
	{
		
		if(n<=1)
		{
			System.out.println("Recursive Method:");
			return 1;
		}
		else 
			return n*recFact(n-1);

	}
}
