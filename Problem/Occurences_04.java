package practice;

public class Occurences_04 
{

	static int Total_Occur(int arr[], int x)
	{
		int count= 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==x)
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,2,3,2,4,4};
		System.out.println("No of Occurences is ");
		System.out.println(Total_Occur(arr,2));

	}

}
