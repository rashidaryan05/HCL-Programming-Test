package practice.string;

public class StringDemo {

	public void display(String str) {
		System.out.println("You are in display String: " + str);
	}

	public void display(StringBuffer str) {
		System.out.println("You are in display StringBuffer: " + str);
	}

	public void display(StringBuilder str) {
		System.out.println("You are in display StringBulder: " + str);
	}

	public void display(Object obj) {
		System.out.println("You are in display Object: " + obj);
	}
}
