package practice.day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter you age: ");
		int age = scan.nextInt();
		System.out.println("Hello " + name + ". Your age is " + age + ".");
		scan.close();

	}
}
