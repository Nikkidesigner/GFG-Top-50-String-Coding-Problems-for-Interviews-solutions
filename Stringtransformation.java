/*The function accepts a string ‘str’ as its argument.
The function needs to return the transformed string by
replacing all occurrences of the character ‘a’ with the
character ‘b’ and vice versa.*/
class Stringtransformation 
{
	public static void main(String[] args) 
	{
		     String str = "abaabbcc";
        System.out.println(transformString(str));
	}
	public static String transformString(String str)
	{
		
		   char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a')
                charArray[i] = 'b';
            else if (charArray[i] == 'b')
                charArray[i] = 'a';
        }
        return new String(charArray);
	}
}
