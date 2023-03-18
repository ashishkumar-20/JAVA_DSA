package practice;

public class Difference_03 {

	static boolean difference(int arr[], int x)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]-arr[i]==x)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int Arr[] = {5,10,15,20,26};
		if(difference(Arr,10))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
