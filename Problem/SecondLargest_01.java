package practice;

public class SecondLargest_01 
{
	static void second(int arr[])
	{
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(largest<arr[i])
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(secondlargest<arr[i] && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);
	}
	
	public static void main(String[] args) 
	{
		int a[]={6,8,2,4,3,1,5,7};
		second(a);
	}

}
