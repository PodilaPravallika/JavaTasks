package tasks.collections;

import java.util.HashMap;
import java.util.Map;

public class BasicMapOperations 
{
	public static void main(String[] args) 
	{	
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		
		hs.put(1, "Abhi");
		hs.put(2, "Bhanu");
		hs.put(3, "chitra");
		hs.put(4, "Daniel");
		hs.put(5, "Emanuel");
		
		for(Map.Entry<Integer,String> e :hs.entrySet())
		{
			System.out.println(e.getKey() + " "+e.getValue());
		}
		
	}
}
