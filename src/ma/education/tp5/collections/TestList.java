package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list1= new ArrayList<Integer>();
//		list1.add(12);
//		list1.add(23);
//		list1.add(23);
//		list1.add(12);
//		
//		System.out.println("affichage with for1 loop");
//        for(Integer i = 0; i < list1.size(); i++) {
//        	System.out.println("element "+i+" value: "+list1.get(i));
//        }
//        
//        System.out.println("affichage with for2 loop");
//        for(Integer e: list1) {
//        	System.out.println("element value:" +e);
//        }
//        
//        System.out.println("affichage with forEach loop");
//        list1.forEach( e-> System.out.println("element value: "+e ));
//        
//        System.out.println("affichage with Iterator Object loop");
//        Iterator<Integer> iter = list1.iterator();
//        while(iter.hasNext()) {
//        	System.out.println("element value: "+iter.next());
//        }
//        
//        List<Integer> list2 = Arrays.asList(1,5,6,9,18);
//        list2.stream().map(item -> item*item).filter(i-> i > 36).forEach(i -> System.out.println(i));       
//        System.out.println("list 3 elements");
//       List<Integer> list3 = new ArrayList();
//       list3.add(5);
//       list3.add(10);
//       list3.add(15);
//       list3.add(20);
//       list3.add(2,10);
//       list3.forEach(i-> System.out.println(i));
//       Set<String> set1 = new HashSet<String>();
//       set1.add("ABC1");
//       set1.add("ABC2");
//       set1.add("ABC3");
//       set1.add("ABC1");
//       set1.add("ABC4");
//       set1.add("ABC5");
//       set1.forEach(i-> System.out.println(i));
		
//		Set<Client> set2 = new HashSet<Client>();
//		set2.add(new Client(1, "ALAMI"));
//		set2.add(new Client(1, "ALAMI"));
//		set2.add(new Client(2, "SOUHALL"));
//		set2.forEach(i -> System.out.println(i));
		
		Set<Integer> set3 = new TreeSet<>();
		set3.add(22);
		set3.add(11);
		set3.add(15);
		set3.add(9);
		set3.forEach(i -> System.out.println(i));
		
		Set<Client> set4 = new TreeSet<>();
		set4.add(new Client(1,"OMAR"));
		set4.add(new Client(3,"SAID"));
		set4.add(new Client(2,"HASSAN"));
		set4.forEach(i-> System.out.println(i));
		
//		Comparator<Client> c = new CodeComparator();
//		Set<Client> set5 = new TreeSet<>(c);
//		set5.add(new Client(1,"OMAR"));
//		set5.add(new Client(3,"SAID"));
//		set5.add(new Client(2,"HASSAN"));
//		set5.forEach(i-> System.out.println(i));
	
		Set<Client> set5 = new TreeSet<>((c1,c2) -> -c1.code+c2.code);
		set5.add(new Client(1,"OMAR"));
		set5.add(new Client(3,"SAID"));
		set5.add(new Client(2,"HASSAN"));
		set5.forEach(i-> System.out.println(i));
	}

}
