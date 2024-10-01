class ReverseOnlyCharTest 
{
	public static void main(String[] args) 
	{
		Reverse("Nikhil123");
	}
	public static void Reverse(String strTest)
		{
		StringBuilder str1 = new StringBuilder();
		String str = strTest;
			for(int i=str.length()-1;i>=0;i--)
				{
				
					if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
						{
							 str1.append(str.charAt(i));
						}
					
		        }

                  for(int i=0;i<str.length();i++)
				{
				
				if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
						{
							 
						}
			    else
					{
							 str1.append(str.charAt(i));
					}
						
					
		        }
                     
				System.out.println(str1);
			
}
}
