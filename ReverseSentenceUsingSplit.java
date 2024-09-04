class ReverseSentence
{
	public void Reverse(String str)
		{
		  StringBuffer sb = new StringBuffer();
			String Stringarray[] = str.split(" ");
			for(int i=Stringarray.length-1;i>=0;i--)
				{
					if(sb.isEmpty())
					sb = sb.append(Stringarray[i]);

					else
					sb = sb.append(" "+Stringarray[i]);
				}
				System.out.println(sb);
		}
}
class ReverseSentenceUsingSplit 
{
	public static void main(String[] args) 
	{
		ReverseSentence r = new ReverseSentence();
		r.Reverse("Hello my name is nikhil");
	}
}
