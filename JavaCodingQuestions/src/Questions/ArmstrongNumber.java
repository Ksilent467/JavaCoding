package Questions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
	//	System.out.println(n^3);
		
		isArmstrong(n);
	}
	
	public static void isArmstrong(int n)
	{
		int num=n;
		int a=0;
		
		while(n!=0)
		{
			int digit=n%10;
			n=n/10;
			a=a+ digit*digit*digit;
		}
		
		if(a==num)
		{
			System.out.println("Its an Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
