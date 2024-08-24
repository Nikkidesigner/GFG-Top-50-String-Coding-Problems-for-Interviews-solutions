class Reversestring
{
	public String stringReverse(String str)
		{
			StringBuilder sb = new StringBuilder();
			for(int i=(str.length()-1);i>=0;i--)
				{
					sb.append(str.charAt(i));
				}
				return sb.toString();
		}
}
class reverseStringFunction 
{
	public static void main(String[] args) 
	{
		Reversestring r = new Reversestring();
		System.out.println(r.stringReverse("Nikhil"));
	}
}
