package sorting;
/*
 * Time complexity in Best case , Average case  and worst case is same O(nlogn)
 * This is the disadvantage of Merge Sort time complexity in best case also 
 * remains same .
 * Space complexity is O(n)
 * Merge sort is stable 
 */
public class MergeSort 
{
	static void display(int a[], int idx)
	{
		if(idx==a.length)
			return;
		System.out.print(a[idx]+" ");
		display(a,idx+1);
	}


	static void merge(int a[], int l, int mid, int r)
	{
		
		int n1=mid-l+1;
		int n2=r-mid;
		int left[]= new int[n1];
		int right[]= new int[n2];
		int i,j,k;
		for(i=0; i<n1; i++) left[i]=a[i+l];
		for(j=0; j<n2; j++) right[j]=a[j+mid+1];
		i=0;
		j=0;
		 k=l;
		 while(i<n1 && j<n2)
		 {
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				k++;
				i++;
			}
			else
			{
				a[k]=right[j];
				k++;
				j++;
			}
		}
		while(i<n1)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=right[j];
			j++;
			k++;
		}
			
		
	}
	static void mergeSort(int a[], int l, int r)
	{
		if(l>=r) return;
		int mid=(l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,mid,r);
	}
	public static void main(String[] args) 
	{
		int a[]= {2,5,10,3,7,14,17,11};
		System.out.println("The unsorted array is :");
		display(a,0);
		mergeSort(a,0,a.length-1);
		System.out.println();
		System.out.println("The sorted array is :");
		display(a,0);


	}

}
