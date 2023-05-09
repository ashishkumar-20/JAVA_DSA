// write a java program to remove elements from bottom of the stack 

package stack;
import java.util.Stack;
public class RemoveBottom
{
	static void removeBottom(Stack<Integer> st)
	{
		if(st.size()==1)
		{
			st.pop();
			return;
		}
		int temp=st.pop();
		removeBottom(st);
		st.push(temp);
	}
	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		removeBottom(st);
		System.out.println(st);
	}

}
