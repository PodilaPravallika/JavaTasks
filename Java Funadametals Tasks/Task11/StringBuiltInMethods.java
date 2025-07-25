package tasks;

public class StringBuiltInMethods 
{
	public static void main(String[] args) 
	{
		String s = "String Introduction";
		System.out.println("Length: " + s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(5));
		System.out.println("Index of 'g': " + s.indexOf('g'));
	}
}
