package pile;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Classe permettant de modeliser une pile en utilsant une liste chainé
 * 
 * @author steeven & yossef
 *
 * @param <E>
 */
public class ListeChaineePile<E> implements Pile<E> {

	/**
	 * Classe interne permettant de définir un noeud de la liste chainé
	 * 
	 * @author steeven & yossef
	 *
	 */
	private class Noeud {
		E value;
		Noeud chain;
		
		/**
		 * contructeur
		 * 
		 * @param value
		 * @param chain
		 */
		Noeud(E value, Noeud chain) {
			this.value = value;
			this.chain = chain;
		}
	}

	private Noeud start;
	
	private int length;

	/**
	 * constructeur
	 */
	public ListeChaineePile() {
		super();
		this.start = null;
		this.length = 0;
	}

	@Override
	public void push(E item) throws Exception {
		this.start = new Noeud(item, this.start);
		this.length++;
	}

	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Erreur pile vide");

		E element = this.start.value;

		this.start = this.start.chain;
		this.length--;
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
		this.start = null;
	}

	public Iterator<E> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<E> {
		// Variables d’instances nécessaires au parcours (par exemple l’élément courant)

		private Noeud currentElement = start;
		public boolean hasNext() {
			return this.currentElement != null;
			// Traitement pour déterminer s’il y a encore des éléments à parcourir
			// return …;
		}

		public E next() {
			// Traitement pour avancer d’un élément
			if(!this.hasNext()) {
				throw new NoSuchElementException("c'etait le dernier element");
			}
			Noeud nextElement = this.currentElement;
			this.currentElement = this.currentElement.chain;
			
			return nextElement.value;		}

		// le remove() est facultatif et n’a pas de sens ici, on ne l’implémente pas
	}

}
