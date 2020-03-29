package com.hcl.removeduplicate;

public class RemoveAdjacentDuplicate {

	public String maxReducedString(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {

				if (i >= 1) {
					// string before adjacent duplicate
					String s = str.substring(0, i);
					// adding strings--- before and after adjacent duplicate
					String st1 = s + str.substring(i + 2, str.length());
					// if you want to reduced string after every step, Please enable below print
					// statement of line 17 and 22
					// System.out.println("Reduced String: " + st1);

					return maxReducedString(st1);
				} else {
					String st1 = str.substring(i + 2, str.length());
					// System.out.println("Reduced String: " + st1);
					return maxReducedString(st1);
				}
			}
		}

		return str;
	}

}
