package practice.sort;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Fruit> {

	public int compare(Fruit o1, Fruit o2) {
		Integer quantity1 = o1.getQuantity();
		Integer quantity2 = o2.getQuantity();
		return quantity1.compareTo(quantity2);
	}

}
