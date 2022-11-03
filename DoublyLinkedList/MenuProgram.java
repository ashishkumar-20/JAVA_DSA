package doublyLinkedList;

public class MenuProgram 
{

	public static void main(String[] args) 
	{
		Doubly d1 = new Doubly();
		while(true)
		{
		System.out.println(" 1. To  create "
				+ "\n 2. To Traversa "
				+ "\n 3. To count"
				+ "\n 4. To Traverse Backward "
				+ "\n 5. To Insert "
				+ "\n 6. To Delete"
				+ "\n 7. To exit ");
		System.out.println("Enter the above option you want to perform :");
		int option=d1.sc.nextInt();
		
		switch(option)
		{
		case 1: 
			d1.create();
			break;
		case 2:
			d1.traversal();
			break;
		case 3:
			System.out.println("The no of nodes is :"+d1.count());
			break;
		case 4:
			d1.prevTraversal();
			break;
		case 5:
			d1.insertMid();
			break;
		case 6:
			d1.delteMid();
			break;
		case 7:
			System.exit(0);
			
		}

	}
	}
}
