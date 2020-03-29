package practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortFruit {

	public static void main(String[] args) {
		Fruit[] ft = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
		Fruit apple = new Fruit("Apple", "Apple description", 85);
		Fruit orange = new Fruit("Orange", "Orange description", 80);
		Fruit banana = new Fruit("Banana", "Banana description", 90);

		ft[0] = pineappale;
		ft[1] = apple;
		ft[2] = orange;
		ft[3] = banana;

		System.out.println("This is using Compareble Sorting");

		Arrays.sort(ft);

		int i = 0;
		for (Fruit temp : ft) {
			System.out.println("Fruit " + ++i + ":" + temp.getFruitName()
					+ "Quantity " + ": " + temp.getQuantity());
		}

		System.out.println("This is using comparator sorting using name object ");
		ArrayList<Fruit> lt = new ArrayList<Fruit>(Arrays.asList(ft));
		/*lt.add(apple);
		lt.add(pineappale);
		lt.add(orange);
		lt.add(banana);*/
		System.out.println("Before ");
		int l = 0;
		for (Fruit temp : lt) {
			System.out.println("Fruit " + ++l + ":" + temp.getFruitName()
					+ "Quantity " + ": " + temp.getQuantity());
		}

		Collections.sort(lt, new NameComparator());

		System.out.println("After ");

		int j = 0;
		for (Fruit temp : lt) {
			System.out.println("Fruit " + ++j + ":" + temp.getFruitName()
					+ "Quantity " + ": " + temp.getQuantity());
		}

		System.out.println("This is using comparator sorting using quantity object");
		Collections.sort(lt, new QuantityComparator());

		int k = 0;
		for (Fruit temp : lt) {
			System.out.println("Fruit " + ++k + ":" + temp.getFruitName()
					+ "Quantity " + ": " + temp.getQuantity());
		}

	}

}
