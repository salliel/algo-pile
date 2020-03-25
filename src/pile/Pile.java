package pile;

import java.util.Iterator;

public interface Pile<E> extends Iterable<E> {

	void push(E item) throws Exception;
	E pop() throws Exception;
	E peek() throws Exception;
	boolean isEmpty();
	int size();
	void clear();
	
}
