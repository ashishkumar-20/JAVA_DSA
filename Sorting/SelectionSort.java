package sorting;

public class SelectionSort
{

	static void display(int arr[], int idx)
	{
		if(idx==arr.length)
			return;
		System.out.print(arr[idx]+" ");
		display(arr,idx+1);
	}
	static void Selection(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int min_index=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,9,8,7,6,5};
		System.out.println("Array before sorting is :");
		display(arr,0);
		System.out.println();
		System.out.println("Array after sorting is :");
		Selection(arr);
		display(arr,0);
		
		

	}

}
