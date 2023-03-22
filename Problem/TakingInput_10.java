package twoDArray;
import java.util.Scanner;
public class TakingInput_10 
{
	
	static void display(int arr[][], int rows, int column)
	{
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rows :");
		int rows=sc.nextInt();
		System.out.println("Enter the value of column :");
		int column=sc.nextInt();
		int arr[][]=new int[rows][column];
		int total=rows*column;
		System.out.println("Enter the "+total +" elements :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		display(arr,rows,column);
	}

}
