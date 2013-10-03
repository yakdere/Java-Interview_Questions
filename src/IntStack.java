/**
 * implement a integer stack with limited capacity using arraylist and vector
 * @author yakdere
 */
import java.util.EmptyStackException;


public abstract class IntStack {

	int capacity_;
	
	IntStack(int capacity) { capacity_ = capacity; }
	
	int Capacity() { return capacity_; }
	
	/**
	 * Pop and return element from stack.
	 * @return int
	 */
	abstract int Pop() throws EmptyStackException;
	
	/**
	 * 
	 * @param elem
	 */
	abstract void Push(int elem) throws FullStackException;
	

	/**
	 * 
	 * @return
	 */
	abstract int Peek() throws EmptyStackException;
	
	
	/**
	 * Returns the number of elements in the stack.
	 * @return
	 */
	abstract int Size();
}
