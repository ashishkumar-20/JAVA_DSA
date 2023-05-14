package queue;
import java.util.Scanner;
public class Linked 
{
	static Scanner sc = new Scanner(System.in);
	Node front,rear=null;
	boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
	void enqueue()
	{
		Node p = new Node();
		System.out.println("Enter the value of data :");
		p.data=sc.nextInt();
		p.next=null;
		
		if(isEmpty())
		{
			front=rear=p;
		}
		else
		{
			rear.next=p;
			rear=p;
		}
	}
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty..");
			return -1;
		}
		else if(front==rear)
		{
			int x=front.data;
			front=rear=null;
			return x;
		}
		else
		{
			int remove=front.data;
			front=front.next;
			return remove;
		}
	}
	void peek()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty !");
		}
		else
		{
		Node temp=front;
		System.out.println("The peek element is "+temp.data);
		}
	}
	void display()
	{
		if(front==null && rear==null)
		{
			System.out.println("Queue is Empty..");
		}
		else
		{
			Node temp=front;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Linked l1 = new Linked();
		System.out.println("Press 1 To check Queue isEmpty !\n"
				+ "Press 2 To enqueue elements !\n"
				+ "Press 3 To dequeue !\n"
				+ "Press 4 To peek !\n"
				+ "Press 5 To display !");
		while(true)
		{
			System.out.println("Enter the Option you want to perform ");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				if(l1.isEmpty())
				{
					System.out.println("Queue is Empty !");
				}
				else
				{
					System.out.println("Queue is not Empty !");
				}
				break;
			case 2:
				l1.enqueue();
				break;
			case 3:
				int x =l1.dequeue();
				System.out.println("The dequeue element is "+x);
				break;
			case 4:
				l1.peek();
				break;
			case 5:
				l1.display();
				break;
			}
		}
	}
}
