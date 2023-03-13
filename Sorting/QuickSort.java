package sorting;

public class QuickSort 
{
	static void display(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swap(int arr[], int x, int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	static int partition(int arr[], int st, int end)
	{
		int pivot=arr[st];
		int cnt=0;
		for(int i=st+1; i<=end; i++)
		{
			if(arr[i]<=pivot)cnt++;
		}
		int pivotIndex=st+cnt;
		swap(arr,st,pivotIndex);
		int i=st;
		int j=end;
		while(i<pivotIndex && j>pivotIndex)
		{
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<pivotIndex && j>pivotIndex)
			{
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		return pivotIndex;
	}
	static void Quicksort(int arr[], int st, int end)
	{
		if(st>=end) return;
		int pi=partition(arr,st,end);
		Quicksort(arr,st,pi-1);
		Quicksort(arr,pi+1,end);
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,1,5,7,4,6,4,3,2};
		System.out.println("Array before sorting :");
		display(arr);
		System.out.println("Arrya after sorting :");
		Quicksort(arr,0,arr.length-1);
		display(arr);
		

	}

}
