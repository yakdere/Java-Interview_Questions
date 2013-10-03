import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class IntStackTest {

	int capacity_;
	
	@Before
	public void setUp() throws Exception {
		capacity_= 100;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		IntStack stack = new IntStackFromVector(capacity_);
		stackTest(stack);
		
		stack = new IntStackArrayList(capacity_);
		stackTest(stack);
	}
	
	public void stackTest(IntStack stack) {
		// Insert 1,2,3
		try {
			stack.Push(1);
			stack.Push(2);
			stack.Push(3);
		} catch(FullStackException e) {
			System.err.println("FullStackException thrown.");
			fail("FullStackException test failed.");
		}
		// Test that stack now has 3 elements.
		assertEquals(3, stack.Size());

		// Test that stack returns 3, 2, 1
		assertEquals(3, stack.Peek());
		assertEquals(3, stack.Pop());

		assertEquals(2, stack.Peek());
		assertEquals(2, stack.Pop());

		assertEquals(1, stack.Peek());
		assertEquals(1, stack.Pop());

		// Test that stack now has no elements.
		assertEquals(0, stack.Size());

	}

	
}
