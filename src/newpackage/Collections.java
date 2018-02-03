package newpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		Map<Character,Integer > m=new HashMap<>();
		m.put('i',4);
		m.put('j',5);
		m.put('k',3);
		int z=m.size();
		System.out.println(z);
		System.out.println(m);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		System.out.println(list);
		HashSet<Integer> list1=new HashSet<>(list);
		Iterator itr=list1.iterator();  
		//list1.addAll(list);
	    System.out.println(list1);
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println(list1.size());
	}
}
