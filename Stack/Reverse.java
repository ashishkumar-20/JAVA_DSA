// java recursive program to reverse the order of stack 

package stack;
import java.util.Stack;
public class Reverse 
{
	
	// recursive method to reverse the stack 
	static void reverse(Stack<Integer> s1)
	{
		if(s1.size()==0)
		{
			return;
		}
		int top=s1.pop();
		System.out.print(top+" ");
		reverse(s1);
		s1.push(top);
	}
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(3);
		st.push(8);
		st.push(7);
		st.push(10);
		reverse(st);	
	}

}
