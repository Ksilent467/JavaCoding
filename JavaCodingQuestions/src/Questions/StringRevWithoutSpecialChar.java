package Questions;

import java.util.Scanner;

public class StringRevWithoutSpecialChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(strRevWithoutSpecial(s));

	}
	
	public static String strRevWithoutSpecial(String s)
	{
		int len=s.length();
        char ch1='a';
        char ch2='a';
        String str="";
        int k=1;
        for(int i=0;i<len;i++)                        //a!!b,c.d@!e
        {
            ch1=s.charAt(i);
            //System.out.println(ch1);
            if(ch1>='a'&& ch1<='z')
            {
            	for(int j=k;j<=len;j++)
            	{
            		ch2=s.charAt(len-j);
            		if(ch2>='a'&& ch2<='z')
                	{
                            str=str+ch2;
                            k=k+1;
                            break;
                	}
            		else
            		{
            			k=k+1;
            		}
            	}
            		
            }
            else
    		{
    			str=str+ch1;
    		}
            
        }
        
        System.out.println("Value of k: "+k);
        return str;
	}

}
