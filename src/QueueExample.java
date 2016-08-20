import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;


public class QueueExample {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//creating queue
		 Queue queue = new LinkedList();
		 
		 //adding queue in the list
		 queue.add("amirul");
		 queue.add("mizan");
		 queue.add("ashek");
		 queue.add("shadhin");
		 
		 
		 //display the contain the queue 
		 System.out.println("Display the conatains queue: "+queue);
		 
		 
		 try {
			 queue.remove();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Empty Queue");
			
		}
		 
		 
		//display the contain the queue 
		 System.out.println("Display the conatains queue: "+queue);
		 
		 
		
		
		

	}

}
