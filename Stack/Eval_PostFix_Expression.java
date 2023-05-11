package expression;
import java.util.Stack;
public class Eval_PostFix_Expression 
{

	public static void main(String[] args) 
	{
//		String s="953+4*6/-";
		String s="231*+9-";
		Stack<Integer> val = new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			int ascii=(int)ch;
			if(ascii>=48 && ascii<=57) val.push(ascii-48);
			else
			{
				int val2=val.pop();
				int val1=val.pop();
				if(ch=='-') val.push(val1-val2);
				if(ch=='+') val.push(val1+val2);
				if(ch=='*') val.push(val1*val2);
				if(ch=='/') val.push(val1/val2);
			}
		}
		int postfix=val.pop();
		System.out.println(postfix);
	}

}
