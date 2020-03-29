package com.hcl.commonparent;

import java.util.ArrayList;
import java.util.List;

public class FindCommonParent {

	Node root;
	int flag = 0;

	private List<Integer> path_one = new ArrayList<>();
	private List<Integer> path_two = new ArrayList<>();
	private List<Integer> common_p = new ArrayList<>();

	// Finds the path from root node to given root of the tree.
	void findCPN(int n1, int n2) {
		path_one.clear();
		path_two.clear();
		common_p.clear();
		findCommonParentNode(root, n1, n2);
	}

	private void findCommonParentNode(Node root, int n1, int n2) {

		if (!findPath(root, n1, path_one)) {
			System.out.println((path_one.size() > 0) ? +n1 + " is present" : +n1 + " is missing in Binary Tree");
			flag = -1;
		}

		if (!findPath(root, n2, path_two)) {
			System.out.println((path_two.size() > 0) ? +n2 + " is present" : +n2 + " is missing in Binary Tree");
			flag = -1;
		}

		int i;
		if (flag != -1) {
			for (i = 0; i < path_one.size() && i < path_two.size(); i++) {
				if (path_one.get(i).equals(path_two.get(i)))
					if (i != path_one.size() - 1 && i != path_two.size() - 1)
						common_p.add(path_one.get(i));
			}
			if (common_p.size() <= 2) {
				System.out.println("Common parents are: " + common_p);
			} else {
				int com1 = common_p.get(common_p.size() - 1);
				int com2 = common_p.get(common_p.size() - 2);

				System.out.println("Common parents are: " + com1 + ", " + com2);
			}
		}
	}

	private boolean findPath(Node root, int n, List<Integer> path) {
		// base case
		if (root == null) {
			return false;
		}

		// Store this node . The node will be removed if
		// not in path from root to n.
		path.add(root.value);

		if (root.value == n) {
			return true;
		}

		if (root.left != null && findPath(root.left, n, path)) {
			return true;
		}

		if (root.right != null && findPath(root.right, n, path)) {
			return true;
		}

		// If not present in subtree rooted with root, remove root from
		// path[] and return false
		path.remove(path.size() - 1);

		return false;
	}

}
