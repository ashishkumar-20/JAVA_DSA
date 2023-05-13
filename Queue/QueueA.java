package queue;
import java.util.Scanner;
public class QueueA 
{
	Scanner sc = new Scanner(System.in);
	int front;
	int rear;
	int size;
	int arr[];
	QueueA()
	{
		System.out.println("Enter the value of array size :");
		size=sc.nextInt();
		front=rear=-1;
		arr = new int[size];
	}
	
	boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}
	public  void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full !");
			return;
		}
		if(rear==-1)
		{
			rear=front=0;
			arr[rear]=x;
		}
		else
		{
			arr[++rear]=x;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty !");
			return -1;
		}
		else
		{
			int x=arr[front];
			front++;
			return x;
		}
	}
	public void peek()
	{
		if(front==-1)
		{
			System.out.println("The peek element is "+-1);
		}
		else
		System.out.println("The peek element is "+arr[front]);
	}
	public void display(int arr[])
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty !");
		}
		else
		{
		for(int i=front; i<=rear; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	}
}
