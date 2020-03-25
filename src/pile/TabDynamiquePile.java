package pile;

import java.lang.reflect.Array;

public class TabDynamiquePile<E> extends TabStatiquePile<E> {


	public TabDynamiquePile(int size) {
		super(size);
	}

	@Override
	public void push(E item) throws Exception {
		if (this.top >= this.tab.length)
			this.allocationDynamique();
		this.tab[top] = item;
		this.top++;

	}

	private void allocationDynamique() {
		@SuppressWarnings("unchecked")
		E[] tabDynamiqueTmp = (E[]) Array.newInstance(Object.class, this.tab.length * 2);

		for (int i = 0; i < this.tab.length; i++) {
			tabDynamiqueTmp[i] = this.tab[i];
		}

		this.tab = tabDynamiqueTmp;
	}
}
