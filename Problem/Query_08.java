package practice;
import java.util.Scanner;
public class Query_08 {

	static int[] MakeFrequencyArray(int arr[])
	{
		int freq[]=new int[100000];
		for(int i=0; i<arr.length; i++)
		{
			freq[arr[i]]++;
		}
		return freq;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,10,69,78,85,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of query :");
		int query=sc.nextInt();
		int freq[]=MakeFrequencyArray(arr);
		while(query>0)
		{
			System.out.println("Enter no to be searched :");
			int x=sc.nextInt();
			if(freq[x]>0)
				System.out.println("Yes");
			else
				System.out.println("no");
			query--;
		}
	}

}
