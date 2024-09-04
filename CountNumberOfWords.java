class CountWords
{
	public int countWords(String str)
		{
			String s = str.trim();
			int i = 0,count=0;
			while(i<s.length())
				{
					while(i<s.length() && s.charAt(i)!=' ')
						{
							i++;
						}
						count++;
					while(i<s.length() && s.charAt(i)==' ') 
						{
							i++;
						}
				}
			return count;
		}
}
class CountNumberOfWords
{
	public static void main(String[] args) 
	{
		 CountWords c = new  CountWords();
		 System.out.println("count of the words :"+c.countWords(" a"));
	}
}
