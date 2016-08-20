import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListWithIteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list = new ArrayList<>();
		
		//adding some element in the list
		list.add("Amirul");
		list.add("Mizan");
		list.add("Shadhin");
		list.add("Ashek");
		
		//show size after adding some string 
		System.out.println("the size of the array list:"+list.size());
		
		
		//iterator comparator use
		Iterator iterator = list.iterator();
		
		
		while (iterator.hasNext()) {
		 
		 Object object = iterator.next();
		 if (object == "Ashek") { // if Ashek is compare to the list then remove from the list.
			 iterator.remove();
			 System.out.println("Remove from the list: "+object);
		}
		 
		 System.out.println("element of the arraylist: "+object);
			
		}
		
		while (iterator.hasNext()) {
			 System.out.println(" "+iterator.next());
		 
			
		}
		
		//foreach loop use
		for (String string : list) {
			System.out.println(" forloop use to display arraylist element: "+string);
		}
		 
		

	}

}
