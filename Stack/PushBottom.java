// write a java program to Push elements at the bottom of the stack

package stack;
import java.util.Stack;
public class PushBottom 
{
	// method to push element at bottom of stack
	public static void PushBottom(Stack<Integer> st, int val)
	{
		if(st.size()==0)
		{
			st.push(val);
			return;
		}
		int top=st.pop();
		PushBottom(st,val);
		st.push(top);
	}
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		int val=1;
		PushBottom(st,val);
		System.out.println(st);
	}
}
