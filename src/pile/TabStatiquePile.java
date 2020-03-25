package pile;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class TabStatiquePile<E> implements Pile<E> {
	
	private E[] tabStatique;
	private int top;
	private int indexCurrentElement;

	@SuppressWarnings("unchecked")
	public TabStatiquePile(int size) {
		super();
		this.tabStatique = (E[]) Array.newInstance(Object.class, size);
		this.top = 0; //indice du sommet
		this.indexCurrentElement = 0; //indice de l'iteration;
	}

	@Override
	public boolean hasNext() {
		return this.tabStatique[indexCurrentElement] != null;
	}

	@Override
	public E next() {
		
		if(!this.hasNext())
			throw new NoSuchElementException("c'etait le dernier element");
		
		E nextElement = this.tabStatique[indexCurrentElement];
		this.indexCurrentElement++;
		
		return nextElement;
	}

	@Override
	public void push(E item) throws Exception {
		if (this.top >= this.tabStatique.length)
			throw new Exception("Erreur pile pleine"); 
		this.tabStatique[top] = item;
		this.top++;
		
	}

	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 
		
		E last = this.tabStatique[this.top-1];
		
		this.tabStatique[this.top-1] = null;
		this.top--;
		
		return last;
	}

	@Override
	public E peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 
		
		return this.tabStatique[this.top-1];
	}

	@Override
	public boolean isEmpty() {
		return this.top == 0;
	}

	@Override
	public int size() {
		return this.top;
	}

	@Override
	public void clear() {
		while (this.top > 0) {
			try {
				this.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public E[] getTabStatique() {
		return tabStatique;
	}

	public void setTabStatique(E[] tabStatique) {
		this.tabStatique = tabStatique;
	}

	
}
