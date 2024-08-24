/*
Given a string of size n, write functions to perform the following operations on a string-

Left (Or anticlockwise) rotate the given string by d elements (where d <= n)

Right (Or clockwise) rotate the given string by d elements (where d <= n).
Examples: 

Input : s = "GeeksforGeeks"
        d = 2
Output : Left Rotation  : "eksforGeeksGe" 
         Right Rotation : "ksGeeksforGee"  
Input : s = "qwertyu" 
        d = 2
Output : Left rotation : "ertyuqw"
         Right rotation : "yuqwert"

Method#1: A Simple Solution is to use a temporary string to do rotations. 
For left rotation, first, copy last n-d characters, then copy first d characters
in order to the temporary string. For right rotation, first, copy last d characters,
then copy n-d characters. 
*/
class rotatestring
{
	public String rotateStringleft(String str , int d)
		{
			String sb = new String();
			sb = str.substring(d) + str.substring(0,d);
			return sb.toString();
		}
	public String rotateStringRight(String str , int d)
		{
			String sb = new String();
			int n=str.length();
			sb = str.substring(n-d,n) + str.substring(0,n-d);
			return sb.toString();
		}
}
public class rotateStringLeftOrRight
{
	public static void main(String[] args)
		{
			rotatestring s = new rotatestring();
			System.out.println(s.rotateStringleft("GeekforGeeks",2));
			System.out.println(s.rotateStringRight("GeekforGeeks",2));
		}
}