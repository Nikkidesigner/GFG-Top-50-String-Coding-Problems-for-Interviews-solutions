class NonRepeating
{
	public void nonrepeating(String str)
		{
			int[] charCount = new int[256];
			for(int i=0;i<str.length();i++)
				{
					charCount[str.charAt(i)]++;
				}
			for(int i=0;i<str.length();i++)
				{
					char word = str.charAt(i);
					if(charCount[word]==1)
						{
							System.out.println(word);
							break;
						}
				}
		}
}
class  NonRepeatingCharacterFromString
{
	public static void main(String[] args) 
	{
		NonRepeating r = new NonRepeating();
		r.nonrepeating("aabbccdef");
	}
}
