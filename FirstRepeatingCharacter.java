class RepeatingCharacter
{
	public void Repeat(String str)
		{
			int[] charcount = new int[256];
			for(int i=0;i<str.length();i++)
				{
					charcount[str.charAt(i)]++;
				}
			for(int i=0;i<str.length();i++)
				{
					if(charcount[str.charAt(i)]>1)
						{
							System.out.println("First repeating character is :"+str.charAt(i));
							break;
						}
				}
		}
}
class FirstRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		RepeatingCharacter r = new RepeatingCharacter();
		r.Repeat("abcccdddr");
	}
}
