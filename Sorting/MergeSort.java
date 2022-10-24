package sorting;

public class MergeSort 
{
	static void Mergesort(int a[],int low, int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			Mergesort(a,low,mid);
			Mergesort(a,mid+1,high);
			Merge(a,low,mid, high);
			
		}
	}
	static void Merge(int a[], int low, int mid, int high)
	{
		int i=low;
		int j=mid+1;
		int k=low;
		int b[]=new int[high+1];
		while(i<=mid && j<=high)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				i++;
				k++;
			}
			else
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			b[k]=a[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			b[k]=a[j];
			j++;
			k++;
		}
		for(int l=low; l<=high; l++)
		{
			a[l]=b[l];
		}
	}
	
	// print array method 
	
	static void printArray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {10,1,5,15,20,12,21,23,7,9};
		System.out.println("The unsorted array is :");
		printArray(arr);
		Mergesort(arr,0,arr.length-1);
		System.out.println("The sorted array is :");
		printArray(arr);
		
	
		
		/*
		 * we can call method by creating object also
		 * 
		 * 
		 * MergeSort m1 = new MergeSort();
		 * System.out.println("The sorted array is :");
		 * m1.Mergesort(arr, 0, arr.length-1);
		 * printArray(arr);
		
		*/
		

	}

}
