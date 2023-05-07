// Write a java program to copy contents of one stack to another in same order

package stack;
import java.util.Stack;
public class CopyStack
{
	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack<>();
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(20);
		s1.push(25);
	   // System.out.println(s1);
		
		Stack<Integer> copy= new Stack<>();
		Stack<Integer> temp = new Stack<>();
		
		while(s1.size()>0)
		{
			temp.push(s1.pop());
		}
		// temp will print stack in reverse order 
		
		// System.out.println(temp); 
		while(temp.size()>0)
		{
			int top=temp.pop();
			s1.push(top);
			copy.push(top);
		}
		// Original stack
		System.out.println(s1);
		// copy stack
		System.out.println(copy);
	}

}
