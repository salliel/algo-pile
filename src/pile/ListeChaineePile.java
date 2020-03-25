package pile;

import java.util.List;
import java.util.NoSuchElementException;

public class ListeChaineePile<E> implements Pile<E>{
	
	private class Noeud {
		E value; 
		Noeud chain;
		
		Noeud(E value, Noeud chain){
			this.value = value;
			this.chain = chain;
		}
	}
	
	private Noeud start;
	private Noeud currentElement;
	private int length;
	

	public ListeChaineePile() {
		super();
		this.start = null;
		this.currentElement = this.start;
		this.length = 0;
	}

	@Override
	public boolean hasNext() {
		return this.currentElement != null;
	}

	@Override
	public E next() {
		if(!this.hasNext()) {
			throw new NoSuchElementException("c'etait le dernier element");
		}
		Noeud nextElement = this.currentElement;
		this.currentElement = this.currentElement.chain;
		
		return nextElement.value;
	}

	@Override
	public void push(E item) throws Exception {
		this.start = new Noeud(item, this.start);
		this.length++;
		this.currentElement = this.start;
	}

	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide");
		
		E element = this.start.value;
		
		this.start = this.start.chain;
		this.length--;
		this.currentElement = this.start;
		return element; 
	}

	@Override
	public E peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide");
		
		
		return this.start.value;
	}

	@Override
	public boolean isEmpty() {
		return this.start == null;
	}

	@Override
	public int size() {
		return this.length;
	}

	@Override
	public void clear() {
		while (this.start != null) {
			try {
				this.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
