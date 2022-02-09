package Questions;

public class KadaneAlgo {

	public static void main(String[] args) {
		
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		kadane(arr);

	}
	
	public static void kadane(int[] a) 
	{
		int max_so_far=0;
		int max_latest=0;
	//	int b=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			max_so_far=max_so_far+a[i];
			if(max_latest<max_so_far)
			{
				max_latest=max_so_far;
			}
			else if(max_so_far<0)
			{
				max_so_far=0;
			}
		}
		System.out.println("Largest sum within the given array is : "+max_latest);
		
	}

}
