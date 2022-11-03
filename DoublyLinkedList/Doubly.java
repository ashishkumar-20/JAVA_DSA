package doublyLinkedList;
import java.util.Scanner;

public class Doubly 
{
	Scanner sc = new Scanner(System.in);
	Node head;
	Node tail;
	void create()
	{
		Node p = new Node();
		System.out.println("Enter the value of data :");
		p.data=sc.nextInt();
		p.prev=null;
		p.next=null;
		head=p;
		tail=p;
		System.out.println("If you want to add more data press 1 :");
		int a = sc.nextInt();
		while(a==1)
		{
			Node q = new Node();
			System.out.println("Enter the value of data :");
			q.data=sc.nextInt();
			p.next=q;
			q.prev=p;
			q.next=null;
			tail=q;
			p=q;
			System.out.println("If you want to add more data press 1 :");
		    a = sc.nextInt();
		}
	}
	void traversal()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	void prevTraversal()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println("null");
	}
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
	
	void insertBeg()
	{
		Node r = new Node();
		System.out.println("Enter the value of data :");
		r.data=sc.nextInt();
		r.prev=null;
		r.next=head;
		head.prev=r;
		head=r;
	}
	
	void inserEnd()
	{
		Node r = new Node();
		System.out.println("Enter the value of data :");
		r.data=sc.nextInt();
		tail.next=r;
		r.prev=tail;
		tail=r;
	}
	void insertMid()
	{
		System.out.println("Enter the position you want to enter :");
		int pos=sc.nextInt();
		int count=count();
		Node temp=head;
		if(pos>=1 && pos<=count)
		{
			if(pos==1)
			insertBeg();
			else if(pos==count)
				inserEnd();
			else 
			{
				for(int i=1; i<pos-1; i++)
				{
					temp=temp.next;
				}
				Node r = new Node();
				System.out.println("Enter the value of data :");
				r.data=sc.nextInt();
				r.prev=temp;
				temp.next.prev=r;
				r.next=temp.next;
				temp.next=r;
			}
		}
	}
	void delteBeg() 
	{
		head=head.next;
		head.prev=null;
	}
	void delteEnd()
	{
		tail=tail.prev;
		tail.next=null;
	}
	void delteMid()
	{
		Node temp=head;
		System.out.println("Enter the position you want to delete end :");
		int position =sc.nextInt();
		int count=count();
		if(position>=1 && position<=count)
		{
			if(position==1)
				delteBeg();
			else if(position==count)
				delteEnd();
			else
			{
				for(int i=1; i<position-1; i++)
				{
					temp=temp.next;
				}
					temp.next=temp.next.next;
					temp.next.prev=temp;
			}
		}
		
		
	}
}
