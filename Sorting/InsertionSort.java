package sorting;

public class InsertionSort 
{
	static void display(int a[],int idx)
	{
		if(idx==a.length)
			return;
		System.out.print(a[idx]+" ");
		display(a,idx+1);
	}
	static void insertion(int a[])
	{
		for(int i=1; i<a.length; i++)
		{
			int j=i;
			while( j>0 && a[j]<a[j-1])
			{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
	}

	public static void main(String[] args)
	{
		int arr[]= {50,40,30,20,10};
		System.out.println("Array before sorting ");
		display(arr,0);
		System.out.println();
		System.out.println("Array after sorting ");
		insertion(arr);
		display(arr,0);
		

	}

}
