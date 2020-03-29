package com.hcl.removeduplicate;

public class RemoveDuplicateMain {

	public static void main(String[] args) {

		RemoveAdjacentDuplicate remDup = new RemoveAdjacentDuplicate();
		String str = "aabcccddddd";
		System.out.println("Given String: " + str);
		String s = remDup.maxReducedString(str);
		System.out.println("Final non reducible string: " + s);
	}

}
