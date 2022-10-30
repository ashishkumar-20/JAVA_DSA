package linked;
import java.util.Scanner;
public class Singly 
{
	Scanner sc = new Scanner(System.in);
	Node head;
	void create()
	{
		Node p = new Node();
		System.out.println("Enter the value of data :");
		p.data=sc.nextInt();
		p.next=null;
		head=p;
		System.out.println("If you want to add  more data press 1 :");
		int a=sc.nextInt();
		while(a==1)
		{
			Node q = new Node ();
			System.out.println("Enter the value of data :");
			q.data=sc.nextInt();
			p.next=q;
			p=q;
			System.out.println("If you want to add  more data press 1 :");
		    a=sc.nextInt();	
		}
	}
	
	// create a traversal method
	void traversal()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	// create a method to count the no of nodes
	
	int count()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
}
