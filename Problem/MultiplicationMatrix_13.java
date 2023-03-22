package twoDArray;
import java.util.Scanner;
public class MultiplicationMatrix_13 
{
	static void Display(int arr[][], int rows, int column)
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
//	static int[][] Multiply(int a[][], int b[][], int r1, int c1, int r2,int c2)
//	{
//		int ans[][] = new int[r1][c2];
//		for(int i=0; i<r1; i++)
//		{
//			for(int j=0; j<c2; j++)
//			{
//				ans[i][j]=0;
//				for(int k=0; k<r; k++)
//				{
//					ans[i][j]=ans[i][j]+a[i][k]*b[k][j];
//				}
//			}
//		}
//		return ans;
//	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rows :");
		int r1=sc.nextInt();
		System.out.println("Enter the value of column :");
		int c1=sc.nextInt();
		int A[][] = new int [r1][c1];
		int total=r1*c1;
		System.out.println("Enter the "+total+" elements :");
		// Enter the first matrix element
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of rows for 2nd matrix :");
		int r2=sc.nextInt();
		System.out.println("Enter the value of column for 2nd matrix :");
		int c2=sc.nextInt();
		int B[][] = new int[r2][c2];
		int total2= r2*c2;
		System.out.println("Enter the "+total2 +" elements :");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix is :");
		Display(A,r1,c1);
		System.out.println("Second Matrix is :");
		Display(B,r2,c2);
		int ans[][]= new int[r1][c2];
		if(c1!=r2)
		{
			System.out.println("Multiplication is not possible "
					+ "because dimension is not same ");
		}
		else
		{
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c2; j++)
			{
				ans[i][j]=0;
				for(int k=0; k<r2; k++)
				{
					ans[i][j]=ans[i][j]+A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("Multiplication of Two Matrix is :");
		Display(ans,r1,c2);
		}
		
	}

}
