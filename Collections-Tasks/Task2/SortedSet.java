package tasks.collections;

import java.util.TreeSet;

public class SortedSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(65);
		ts.add(11);
		ts.add(89);
		ts.add(90);
		ts.add(9);
		ts.add(1);
		
		for(Integer i : ts)
		{
			System.out.print(i+ ",");
		}
	}
}
