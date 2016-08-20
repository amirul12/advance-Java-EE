import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String>map = new HashMap<>();
		
		 
		 //put element to the map
		 map.put("one", "Amirul");
		 map.put("two", "Mizan");
		 map.put("three", "Shadhin");
		 
		 //size of map
		 System.out.println("Display the first value: " +map.size());
		 
		 System.out.println("Display the first value: " +map.get("one"));
		 
		 //show all value that in map
		 System.out.println("Show all value: " +map.values());
		 
		 
		 
		 
	}
		
	}
