package sorting;

public class BubbleSort 
{
	// print array method
	static void printArray(int a[])
	{
		// printing array element using for each loop
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static void BubbleSort(int a[])
	{
		int temp;
		int flag=0;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0)
			{
				break;
			}
//			printArray(a);
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {36,19,29,12,5};
		System.out.println("The Original array is : ");
		// call print array method
		printArray(a);
		BubbleSort(a);
		System.out.println("The sorted array is :");
		printArray(a);
		
		
	}

}
