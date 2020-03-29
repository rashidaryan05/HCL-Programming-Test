package practice.day1;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Please provide the input");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for  multiplication");
			System.out.println("4 for exit");

			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();

			if (option == 1) {
				System.out.println("Please enter two numbers to add");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int result = num1 + num2;
				System.out.println("Result set is " + result);
			} else if (option == 2) {
				System.out.println("Please enter two numbers to subtract");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int result = num1 - num2;
				System.out.println("Result set is " + result);
			} else if (option == 3) {
				System.out.println("Please enter two numbers to multiply");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int result = num1 * num2;
				System.out.println("Result set is " + result);
			} else if (option == 4) {
				System.out.println("Programme Closed");
				break;
			} else {
				System.out.println("Wrong input. Please ry again");
			}
			scan.close();
		}

	}

}
