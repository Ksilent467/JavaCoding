package Questions;

import java.util.Scanner;

public class StrPalindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		int len=str.length();	
		String str1=str.toLowerCase();
		int flag=0;
		for(int i=0;i<len/2;i++)
		{
			if(str1.charAt(i)!=str1.charAt(len-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
