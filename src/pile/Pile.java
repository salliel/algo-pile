package pile;

/**
 * Interface contenant l'ensemble des methodes à implementer pour definir et modéliser une pile
 * 
 * @author steeven & yossef
 *
 * @param <E>
 */
public interface Pile<E> extends Iterable<E> {

	/**
	 * Methode permettant d'empiler un element dans une pile
	 * @param item
	 * @throws Exception
	 */
	void push(E item) throws Exception;
	
	/**
	 * Methode permettant de depiler un element de la pile
	 * @return le sommet depilé
	 * @throws Exception
	 */
	E pop() throws Exception;
	
	/**
	 * Methode permettant de retourne le sommet de la pile sans le depiler
	 * @return le sommet
	 * @throws Exception
	 */
	E peek() throws Exception;
	
	/**
	 * test si la pile est vide ou non
	 * 
	 * @return true si vide false sinon
	 */
	boolean isEmpty();
	
	/**
	 * renvoie le nombre d'element dans une pile
	 * 
	 * @return taille de la pile
	 */
	int size();
	
	/**
	 *Methode permettant de vide la pile 
	 */
	void clear();
	
}
