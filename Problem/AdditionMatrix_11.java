package twoDArray;
import java.util.Scanner;
public class AdditionMatrix_11 
{

	static void display(int arr[][], int r, int c)
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
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
		int M1[][] = new int [r1][c1];
		System.out.println("Enter the "+r1*c1+" element :");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				M1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of rows for 2nd matrix :");
		int r2=sc.nextInt();
		System.out.println("Enter the value of column for 2nd matrix :");
		int c2=sc.nextInt();
		System.out.println("Enter the "+r2*c2+" elements :");
		int M2[][] = new int[r2][c2];
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				M2[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix is :");
		display(M1,r1,c1);
		System.out.println("Second Matrix is :");
		display(M2,r2,c2);
		int Addition[][]=new int[r1][c1];
		if(r1!=r2 || c1!=c2)
		{
			System.out.println("Addition is not possible dimension is different ");
		}
		else
		{
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				Addition[i][j]=M1[i][j]+M2[i][j];
			}
		}
		System.out.println("Addition of two matrix is :");
		display(Addition,r1,c1);
		}
	}

}
