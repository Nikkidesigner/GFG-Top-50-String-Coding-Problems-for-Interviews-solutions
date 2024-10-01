class SwappingOfStringWithoutUsingExtraVar 
{
	public static void main(String[] args) 
	{
		Swap("Hello","World");
	}
	public static void Swap(String s1, String s2)
		{
		System.out.println("Before swapping :" +s1+"  "+s2);
			s1=s1+s2;
			s2=s1.substring(0,s2.length());
			s1=s1.substring(s2.length());
			System.out.println("After swapping :" +s1+"  "+s2);
		}
}
