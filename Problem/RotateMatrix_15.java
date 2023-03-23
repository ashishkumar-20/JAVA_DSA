package twoDArray;
import java.util.Scanner;
public class RotateMatrix_15 
{

	static void display(int Matrix[][], int rows, int column)
	{
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] transpose(int Matrix[][], int rows, int column)
	{
		int trans[][] = new int [column][rows];
		for(int i=0; i<column; i++)
		{
			for(int j=0; j<rows; j++)
			{
				trans[i][j]=Matrix[j][i];
			}
		}
		return trans;
	}
	static void reverse(int arr[])
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rows :");
		int rows =sc.nextInt();
		System.out.println("Enter the value of column :");
		int column=sc.nextInt();
		int Matrix[][] = new int[rows][column];
		System.out.println("Enter the "+rows*column+" elements :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				Matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is :");
		display(Matrix,rows,column);
		int ans[][]=transpose(Matrix,rows,column);
//		System.out.println("Transpose is  :");
//		display(ans,column,rows);
		for(int i=0; i<column; i++)
		{
			reverse(ans[i]);
		}
		System.out.println("Rotated Matrix is :");
		display(ans,column,rows);
	}

}
