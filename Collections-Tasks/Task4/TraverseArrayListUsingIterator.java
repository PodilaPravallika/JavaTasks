package tasks.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayListUsingIterator {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add(12);
        al.add("Alice");
        al.add('a');
        al.add(23.5);
        al.add(true);
        al.add("Andrew");
        al.add("Bob");

        Iterator<Object> itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            if (element instanceof String) {
                String str = (String) element;
                if (str.startsWith("A")) {
                    itr.remove(); // Remove elements that start with 'A'
                }
            }
        }

        System.out.println("List after removing elements starting with 'A':");
        for (Object obj : al) {
            System.out.println(obj);
        }
    }
}
