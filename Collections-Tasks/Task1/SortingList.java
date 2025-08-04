package tasks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingList 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter values to the arraylist : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=10;i++)
		{
			al.add(sc.nextInt());
		}
		
		Collections.sort(al);
		System.out.println("Sorted in ascending order : "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted in descending order : "+al);
		
		sc.close();
		
	}
}
