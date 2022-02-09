package Questions;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num you wanna search: ");
		int x=sc.nextInt();
		
		primeCheck(x);
	}
	
	public static void primeCheck(int n) {
		int flag=0;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;	
			}
		}
		
		if(flag==1)
		{
			System.out.println("No.is not a Prime");
		}
		else
		{
			System.out.println("Its a Prime");
		}
	}

}
