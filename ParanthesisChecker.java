class Stack
{
	private int top;
	private int maxsize;
	private char data;
	char[] arr;
	public Stack(int maxsize)
		{
			this.top=-1;
			this.maxsize=maxsize;
			this.arr = new char[maxsize];
		}
	public void push(char data)
		{
			if(this.top>=maxsize-1)
				{
					System.out.println("Stack is full");
				}
			else
				{
					this.top++;
					arr[top]=data;
				}
		}
	public void pop()
		{
			if(top<0)
			{
			System.out.println("Stack is empty");
			}
		else
			{
				top--;
			}
		}
	public boolean isEmpty()
		{
			if(this.top<0)
				{
					return true;
				}
			else
				{
					return false;
				}
		}
	public char peek()
		{
			if(top<0)
				{
					System.out.println("stack is empty");
					return 0;
				}
			else
				{
					return arr[this.top];
				}
		}
	
}
class Paranthesis
{
	public void checkparanthesis(String str)
		{
		   int maxsize = str.length();
			Stack s = new Stack(maxsize);
			for(int i=0;i<maxsize;i++)
				{
					char ch = str.charAt(i);
					if(s.isEmpty())
						{
							s.push(ch);
						}
					else if(ch=='{'||ch=='['||ch=='(')
						{
							s.push(ch);
						}
					else if(ch=='}' && s.peek()=='{')
						{
							s.pop();
						}
					else if(ch==']' && s.peek()=='[')
						{
							s.pop();
						}
					else if(ch==')' && s.peek()=='(')
						{
							s.pop();
						}
				}
			if(s.isEmpty())
			 {
				System.out.println("given string is well formed.");
			 }
			 else
				 {
					System.out.println("given string is not well formed.");
				 }
		}
}
class ParanthesisChecker 
{
	public static void main(String[] args) 
	{
		Paranthesis p = new Paranthesis();
		p.checkparanthesis("{[()]}");   // well formed
		 p.checkparanthesis("{[()]}"); //  well-formed
        p.checkparanthesis("{[(])}"); //   not well-formed
        p.checkparanthesis("{[()]}()"); // well-formed
        p.checkparanthesis("{[()]"); //    not well-formed
	}
}
