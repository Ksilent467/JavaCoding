package Questions;

import java.util.Scanner;

public class IntPalindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		isPalindrome(n);
	}
	
	public static void isPalindrome(int n)
	{
		int rev=0;
		int num=n;
		while(n!=0)
		{
			int remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		
		if(num==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
