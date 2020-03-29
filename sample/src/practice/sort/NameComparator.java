package practice.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Fruit> {

	public int compare(Fruit o1, Fruit o2) {
		return o1.getFruitName().compareTo(o2.getFruitName());

	}

}
