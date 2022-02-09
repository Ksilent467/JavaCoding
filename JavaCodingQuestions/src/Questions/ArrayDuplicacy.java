package Questions;
//This is to check duplicates in an array
public class ArrayDuplicacy {
	public static void main(String args[])
	{
		int a[]= {5,2,5,1,5,2};
		int k=0;
		int len=a.length;
		int b[]=new int[len];
		
		
		for(int i=0;i<len;i++)
		{
			int element=a[i];
			int count=0;
			for(int j=0;j<len;j++)
			{
				if(element!=b[j])
				{
					continue;
				}
				else 
				{
					count++;
					break;
				}
			}
			if(count==0) 
			{
				b[k]=element;
				k=k+1;
				continue;
			}
			
			
		}
		
		System.out.println("Array with no duplicates: \nThere are " + k + " uniques elements in the given array:");
		for(int x: b)
		{
			System.out.println(x);
		}
	}

}
