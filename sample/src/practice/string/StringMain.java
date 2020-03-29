package practice.string;

public class StringMain {
	public static void main(String[] args) {
		String s = "Rashid";
		double d;
		StringBuffer sb = new StringBuffer(s);
		StringDemo sDemo = new StringDemo();
		sDemo.display("rashid");
		sDemo.display(sb);

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.max(Double.MAX_VALUE, 0.0d));
	}
}
