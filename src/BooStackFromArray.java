import java.util.ArrayList;
import java.util.EmptyStackException;


public class BooStackFromArray extends BooStack {
	
	private ArrayList<Boolean> data_a_;
	
	BooStackFromArray(int capacity) {
		super(capacity);
		data_a_ = new ArrayList<Boolean>();
	}

	
	@Override
	boolean Pop() throws EmptyStackException {
		if (data_a_.isEmpty()) {
			throw new EmptyStackException();
		}
		
		boolean value = data_a_.get(data_a_.size() - 1);
		data_a_.remove(Size()-1);
		return value;
	}

	@Override
	void Push(boolean item) throws FullStackException {
		if (data_a_.size() == Capacity())
			throw new FullStackException();
		data_a_.add(item);
	}

	@Override
	boolean Peek() throws EmptyStackException {
		if (data_a_.isEmpty()) {
			throw new EmptyStackException();
		}
		return data_a_.get(data_a_.size() - 1);
	}

	@Override
	int Size() {
		return data_a_.size();
	}
	
}
