import java.util.EmptyStackException;
/**
 * implement a boolean stack with limited capacity
 * @author yakdere
 *
 */

public abstract class BooStack {
	int capacity_;
	
	
	BooStack(int capacity) { capacity_ = capacity; }
	
	int Capacity() { return capacity_; }
	
	/**
	 * Pop and return element from stack.
	 * @return int
	 */
	abstract boolean Pop() throws EmptyStackException;
	
	/**
	 * 
	 * @param item
	 */
	abstract void Push(boolean item) throws FullStackException;
	

	/**
	 * 
	 * @return
	 */
	abstract boolean Peek() throws EmptyStackException;
	
	
	/**
	 * Returns the number of elements in the stack.
	 * @return
	 */
	abstract int Size();
}
