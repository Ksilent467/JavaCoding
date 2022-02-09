package Questions;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("1.Loop Method");
		System.out.println("2.Pre-Defined Method in StringBuffer");
		System.out.println("How do you wanna reverse the string?");
		int m=sc.nextInt();
		
		switch(m)
		{
		case 1: System.out.println(strRev(str));
		break;
		
		case 2: System.out.println(strRevMethod(str));
		break;
		
		default: System.out.println("Invalid choice!");
		}

	}
	
	public static String strRev(String str)
	{
		int len=str.length();
		String str1="";
		for(int i=0;i<len;i++)
		{
			str1=str1+str.charAt(len-1-i);
		}
		return str1;
	}
	public static String strRevMethod(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
		
	}

}
