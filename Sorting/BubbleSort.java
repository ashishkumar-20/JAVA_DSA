package sorting;

public class BubbleSort {

	static void display(int a[], int idx)
	{
		if(idx==a.length)  // base case
			return ;
		System.out.print(a[idx]+" "); // self work
		display(a,idx+1); // recursive case
	} 
	
	static void Bubble(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			boolean flag=false;
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) 
			{
				return;
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]= {10,40,30,50,20};
		System.out.println("Array before sorting ");
		display(arr,0);
		System.out.println();
		Bubble(arr);
		System.out.println("Array after sorting ");
		display(arr,0);
	}

}
