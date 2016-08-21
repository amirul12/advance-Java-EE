import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapWithIterator {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String>map = new HashMap<>();
		
		 
		 //put element to the map
 
		 map.put("one", "Shadhin");
		 map.put("two", "Ashek");
		 map.put("three", "Mizan");
		 
		 //size of map
		 System.out.println("Display the first value: " +map.size());
		 
		 Set set = map.entrySet();
		 
		 Iterator iterator = set.iterator();
		 
		 while (iterator.hasNext()) {
			 
			 Map.Entry mEntry = (Entry) iterator.next();
			 
			 System.out.println(""+mEntry.getKey()+" "+mEntry.getValue());
			 
			
		}
		 
		 System.out.println("Display the first value: " +map.get("one"));
		 
		 //show all value that in map
		 System.out.println("Show all value: " +map.values());
		 
		 
		 
		 
	}
}