package practice;

public class SortZerosOnes_06 {
	static void print(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void swap(int arr[], int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void sort(int arr[])
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==1 && arr[j]==0)
			{
				swap(arr,i,j);
				i++;
				j--;
			}
			else if(arr[i]==0)
			{
				i++;
			}
			else if(arr[j]==1)
			{
				j--;
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,0,1,1,0,1,0,1,1,0};
		System.out.println("Array before sort : ");
		print(arr);
		sort(arr);
		System.out.println("Array after sort : ");
		print(arr);
	}

}
