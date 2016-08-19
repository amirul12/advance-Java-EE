import java.util.EmptyStackException;
import java.util.Stack;


public class StackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		
		//display all value in the stack
		System.out.println("Contains of the Stack: "+stack);
		
		try {
			stack.pop();
			
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Empty Stack");
		}
		 
		 //after pop , then value of the stack
		System.out.println("Contains of the Stack: "+stack);
		
		//Search value -1 no found
		System.out.println("Search the value in the stack: "+stack.search("4"));
		System.out.println("Search the value in the stack: "+stack.search("6"));
		
	}

}
