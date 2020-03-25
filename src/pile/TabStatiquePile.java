package pile;

import java.lang.reflect.Array;
import java.util.Iterator;

public class TabStatiquePile<E> implements Pile<E> {
	
	protected E[] tab;
	protected int top;

	@SuppressWarnings("unchecked")
	public TabStatiquePile(int size) {
		super();
		this.tab = (E[]) Array.newInstance(Object.class, size);
		this.top = 0; //indice du sommet
	}

	@Override
	public void push(E item) throws Exception {
		if (this.top >= this.tab.length)
			throw new Exception("Erreur pile pleine"); 
		this.tab[top] = item;
		this.top++;
		
	}

	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 

		this.top--;

		E last = this.tab[this.top];
		
		this.tab[this.top] = null;
		
		return last;
	}

	@Override
	public E peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide"); 
		
		return this.tab[this.top-1];
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
		this.top = 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<E> {
		// Variables d’instances nécessaires au parcours (par exemple l’élément courant)
		private int indexNextFree = top;

		public boolean hasNext() {
			return this.indexNextFree != 0;
			// Traitement pour déterminer s’il y a encore des éléments à parcourir
			// return …;
		}

		public E next() {
			return tab[--this.indexNextFree];
		}

		// le remove() est facultatif et n’a pas de sens ici, on ne l’implémente pas
	}
}
