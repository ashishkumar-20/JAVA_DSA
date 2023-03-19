package practice;

public class RotateArray_07
{
	static void print(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	 
	static void Reverse(int arr[], int i, int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	static void Rotate(int arr[],int k)
	{
		int n=arr.length;
		k=k%n;  // k can be greater than n
		Reverse(arr,0,n-k-1);
		Reverse(arr,n-k,n-1);
		Reverse(arr,0,n-1);
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		System.out.println("Array Before Rotation : ");
		print(arr);
		Rotate(arr,3);
		System.out.println("Array after Rotation :");
		print(arr);
	}
}
