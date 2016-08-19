import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new ArrayList<>();
		System.out.println("Initaial Size of List "+list.size());
		
		
		//adding string in a list
		
		list.add("amirul");
		list.add("mizan");
		list.add("Shadin");
		list.add("ashek");
		
		//after adding now the array list
		System.out.println("Initaial Size of List "+list.size());
		
		//display all the contains in array list
		
		System.out.println("Contains of array list:" +list);
		
		//display the first element that contains in arraylist
		System.out.println("Display the first Element: " +list.get(0));		
		
		//remove the element from the list
		System.out.println("Remove first element from the arraylist: " +list.remove(0));
		System.out.println("Removing and now Contains of array list:" +list);
		
		//search the element 
		System.out.println("Search amirul in the arraylist: " +list.contains("amirul"));
		System.out.println("Search mizan in the arraylist: " +list.contains("mizan"));
		
	}

}
