package doublyLinkedList;

public class Test 
{
	public static void main(String[] args)
	{
		// create object of Doubly class
		Doubly d1 = new Doubly();
		d1.create();
		System.out.println("No of nodes is :"+d1.count());
		d1.traversal();
		d1.prevTraversal();
//		d1.insertBeg();
//		d1.inserEnd();
//		d1.insertMid();
//		d1.delteBeg();
//		d1.delteEnd();
		d1.delteMid();
		d1.traversal();
		d1.prevTraversal();
		
	}
}
