package pileTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pile.ListeChaineePile;
import pile.Pile;

class ListeChaineePileTest {

	@Test
	void testPush() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			for (int i = 0; i < 9; i++) {
				p.push(5);
			}
			
			assertEquals(9, p.size());
			assertEquals(5, p.peek());
			assertEquals(5, p.pop());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	@Test
	void testPop() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			for (int i = 0; i < 9; i++) {
				p.push(5);
			}
			
			for (int i = 0; i < 3; i++) {
				p.pop();
			}
			
			assertEquals(6, p.size());

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	void testPeek() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			p.push(5);
			assertEquals(5, p.peek());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testIsEmpty() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			p.push(5);
			assertFalse(p.isEmpty());
			p.pop();
			assertTrue(p.isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	void testSize() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			for (int i = 0; i < 9; i++) {
				p.push(5);
			}
			
			assertEquals(9, p.size());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	void testClear() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			for (int i = 0; i < 9; i++) {
				p.push(5);
			}
			
			assertEquals(9, p.size());
			
			p.clear();
			assertTrue(p.isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testHasNext() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			assertFalse(p.hasNext());
			p.push(5);
			assertTrue(p.hasNext());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testNext() {
		Pile<Integer> p = new ListeChaineePile<>();
		try {
			p.push(1);
			assertEquals(1, p.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
