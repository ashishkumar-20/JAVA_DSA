package practice;

public class MoveEvenIntegers_09
{
	// program to move even integers in the front 
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
	static void Move(int arr[])
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]%2!=0 && arr[j]%2==0)
			{
				swap(arr, i, j);
				i++;
				j--;
			}
			else if(arr[i]%2==0)
			{
				i++;
			}
			else if(arr[j]%2!=0)
			{
				j--;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("Array before move :");
		print(arr);
		Move(arr);
		System.out.println("Array after move :");
		print(arr);
	}
}
