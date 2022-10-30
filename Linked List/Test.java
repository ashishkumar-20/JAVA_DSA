package linked;

public class Test 
{
	public static void main(String[]args)
	{
		// create object of Singly class
		Singly s1 = new Singly();
		s1.create();
		s1.traversal();
		System.out.println("The no of nodes is :"+s1.count());
	}
}
