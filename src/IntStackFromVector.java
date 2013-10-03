import java.util.EmptyStackException;
import java.util.Vector;

public class IntStackFromVector extends IntStack {

	private Vector<Integer> data_v_;
	
	// Constructor: Initialize all variables.
	public IntStackFromVector(int capacity) {
		super(capacity);
		data_v_ = new Vector<Integer>();
	}
	
	@Override
	public int Pop() throws EmptyStackException {
		if (data_v_.isEmpty()) {
			throw new EmptyStackException();
		}
		
		int value = data_v_.lastElement();
		data_v_.remove(data_v_.size() - 1);
		return value;
	}

	@Override
	public void Push(int elem) throws FullStackException {
		if (data_v_.size() == Capacity())
			throw new FullStackException();
		
		data_v_.addElement(elem);
	}

	@Override
	public int Peek() {
		if (data_v_.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return data_v_.lastElement();
	}
	
	@Override
	public int Size() {
		return data_v_.size();
	}
	
}
