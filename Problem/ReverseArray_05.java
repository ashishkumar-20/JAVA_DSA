package practice;

public class ReverseArray_05 {

	static void print(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swap(int arr[], int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void Reverse(int arr[])
	{
		int temp=0;
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Array before reverse :");
		print(arr);
		Reverse(arr);
		System.out.println("Array after reverse :");
		print(arr);
	}

}
