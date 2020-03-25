package pileTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pile.Pile;
import pile.TabDynamiquePile;

class TabDynamiquePileTest {

	@Test
	void testPush() {
		Pile<Integer> p = new TabDynamiquePile<>(2);
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
}
