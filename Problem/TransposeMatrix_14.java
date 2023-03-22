package twoDArray;
import java.util.Scanner;
public class TransposeMatrix_14 
{
	static void PrintMatrix(int Matrix[][], int rows, int column)
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
	static int[][] Transpose(int Matrix[][], int column, int rows)
	{
		int transpose[][]= new int[column][rows];
		for(int i=0; i<column; i++)
		{
			for(int j=0; j<rows; j++)
			{
				transpose[i][j]=Matrix[j][i];
			}
		}
		return transpose;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rows :");
		int rows=sc.nextInt();
		System.out.println("Ente the value of column :");
		int column=sc.nextInt();
		int Matrix[][] = new int[rows][column];
		System.out.println("Enter the "+rows*column+" elements :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column ; j++)
			{
				Matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print Matrix :");
		PrintMatrix(Matrix,rows,column);
		int ans[][]=Transpose(Matrix,column,rows);
		System.out.println("Transpose of Matrix is :");
		PrintMatrix(ans,column,rows);
	}

}
