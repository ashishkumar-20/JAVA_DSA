package expression;
import java.util.Stack;
public class Eval_Prefix_Expression 
{

	public static void main(String[] args) 
	{
//		String s="-9/*+5346";
//		String s="-+8/632";
		String s="-+7*45+20";
		
		Stack<Integer> val = new Stack<>();
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			int ascii= (int)ch;
			if(ascii>=48 && ascii<=57) val.push(ascii-48);
			else
			{
				int val1=val.pop();
				int val2=val.pop();
				if(ch=='-') val.push(val1-val2);
				if(ch=='+') val.push(val1+val2);
				if(ch=='*') val.push(val1*val2);
				if(ch=='/') val.push(val1/val2);
			}
		}
		int prefix=val.pop();
		System.out.println(prefix);
	}

}
