import java.util.ArrayList;
import java.util.EmptyStackException;


public class IntStackArrayList extends IntStack {

	private ArrayList<Integer> data_a_;
	
	IntStackArrayList(int capacity) {
		super(capacity);
		data_a_ = new ArrayList<Integer>();
	}

	@Override
	public int Pop() throws EmptyStackException {
		if (data_a_.isEmpty()) {
			throw new EmptyStackException();
		}
		
		int value = data_a_.get(data_a_.size() - 1);
		data_a_.remove(Size()-1);
		return value;
	}

	@Override
	public void Push(int elem) throws FullStackException {
        if (data_a_.size() == Capacity()) {
        	throw new FullStackException();
        }
        
        data_a_.add(elem);
	}

	@Override
	public int Peek() throws EmptyStackException {
		if (data_a_.isEmpty()) {
			throw new EmptyStackException();
		}
		return data_a_.get(data_a_.size() - 1);
	}

	@Override
	public int Size() {
		return data_a_.size();
	}
	
}
