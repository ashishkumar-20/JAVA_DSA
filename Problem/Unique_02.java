package practice;

public class Unique_02 
{
	static int unique(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
					arr[i]=arr[j]= -1;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
				return arr[i];
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		int arr[]= {3,5,5,3,1,3,2,2};
		System.out.print("The unique element is : ");
		System.out.println(unique(arr));

	}
}
