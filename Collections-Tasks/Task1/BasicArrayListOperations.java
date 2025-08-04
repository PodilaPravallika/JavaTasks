package tasks.collections;

import java.util.ArrayList;

public class BasicArrayListOperations 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("C++");
		al.add("C");
		al.add("Ruby");
		al.add("Python");
		
		al.remove(2);
		
//		for(String s:al)
//		{
//			System.out.println(s);
//		}
		
		System.out.println(al);
	}
}
