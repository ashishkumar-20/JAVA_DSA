package twoDArray;
import java.util.Scanner;
public class SubtractionMatrix_12 
{
	static void print(int arr[][], int rows, int column)
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
		System.out.println("Enter the value of rows for 1st matrix :");
		int r1=sc.nextInt();
		System.out.println("Enter the value of column for 1st matrix :");
		int c1=sc.nextInt();
		System.out.println("Enter the "+r1*c1+" elements :");
		int Matrix1[][] = new int[r1][c1];
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				Matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of rows for 2nd matrix :");
		int r2=sc.nextInt();
		System.out.println("Enter the value of column for 2nd matrix :");
		int c2=sc.nextInt();
		System.out.println("Enter the "+r2*c2+" elements :");
		int Matrix2[][] = new int[r2][c2];
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				Matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("The first matrix is :");
		print(Matrix1,r1,c1);
		System.out.println("The second matrix is :");
		print(Matrix2,r2,c2);
		int ans[][]= new int[r1][c1];
		if(r1!=r2 || c1!=c2)
		{
			System.out.println("Subtraction is not possible dimension is not same ");
		}
		else
		{
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				ans[i][j]=Matrix1[i][j]-Matrix2[i][j];
			}
		}
		System.out.println("Subtraction of two matrix is :");
		print(ans,r1,c1);
		}
	}
}
