package queue;

public class TestA
{
	public static void main(String[] args) 
	{
		QueueA q = new QueueA();
		System.out.println("Press 1 To check Queue is Empty ! \n"
				+ "Press 2 To check Queue is Full ! \n"
				+ "Press 3 To add elements in the Queue ! \n"
				+ "Press 4 To remove elements from the Queue \n"
				+ "Press 5 for check peek element !"
				+ "Press 6 To Display the Queue !\n"
				+ "Press 7 To exit !");
		
		while(true)
		{
			System.out.println("Enter option you want to perform :");
			int option=q.sc.nextInt();
		
		switch(option)
			{
			case 1:
				if(q.isEmpty())
				{
					System.out.println("Queue is Empty !");
				}
				else
					System.out.println("Queue is not Empty !");
				break;
			case 2 :
				if(q.isFull())
				{
					System.out.println("Queue is Full !");
				}
				else
					System.out.println("Queue is not Full !");
				break;
			case 3:
				System.out.println("Enter the value you want to insert :");
				int x =q.sc.nextInt();
				q.enqueue(x);
				break;
			case 4 :
				int remove=q.dequeue();
				System.out.println("The remove elements is "+remove);
				break;
			case 5:
				q.peek();
				break;
			case 6:
				q.display(q.arr);
				break;
			case 7:
				System.exit(0);
			}
		}
	}

}
