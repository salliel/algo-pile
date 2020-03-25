package pile;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class TabDynamiquePile<E> implements Pile<E> {

	private E[] tabDynamique;
	private int top;
	private int indexCurrentElement;
	

	@SuppressWarnings("unchecked")
	public TabDynamiquePile(int size) {
		super();
		this.tabDynamique = (E[]) Array.newInstance(Object.class, size);
		this.top = 0; //indice du sommet 
		this.indexCurrentElement = 0; //indice de l'iteration
	}

	@Override
	public boolean hasNext() {
		return this.tabDynamique[this.indexCurrentElement] != null;
	}

	@Override
	public E next() {
		if(!this.hasNext())
			throw new NoSuchElementException("c'etait le dernier element");
		
		E nextElement = this.tabDynamique[indexCurrentElement];
		this.indexCurrentElement++;
		
		return nextElement;
	}

	@Override
	public void push(E item) throws Exception {
		if (this.top >= this.tabDynamique.length)
			this.allocationDynamique();
		this.tabDynamique[top] = item;
		this.top++;
		
	}


	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 
		
		E last = this.tabDynamique[this.top -1];
		
		this.tabDynamique[this.top -1] = null;
		this.top--;
		
		return last;
	}

	@Override
	public E peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 
		
		return this.tabDynamique[this.top -1];
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
		return tabDynamique;
	}

	public void setTabStatique(E[] tabStatique) {
		this.tabDynamique = tabStatique;
	}
	
	private void allocationDynamique() {
		@SuppressWarnings("unchecked")
		E[] tabDynamiqueTmp = (E[]) Array.newInstance(Object.class, this.tabDynamique.length*2);
		
		for (int i = 0; i < this.tabDynamique.length; i++) {
			tabDynamiqueTmp[i] = this.tabDynamique[i];
		}
		
		this.tabDynamique = tabDynamiqueTmp;
	}
}
