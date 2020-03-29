package com.hcl.commonparent;

public class FindCommonParentMain {

	public static void main(String[] args) {

		FindCommonParent bTree = new FindCommonParent();
		bTree.root = new Node(1);
		bTree.root.left = new Node(2);
		bTree.root.right = new Node(3);
		bTree.root.left.left = new Node(4);
		bTree.root.left.right = new Node(5);
		bTree.root.right.left = new Node(6);
		bTree.root.right.right = new Node(7);
		bTree.root.left.left.left = new Node(8);
		bTree.root.left.left.right = new Node(9);
		bTree.root.left.right.left = new Node(10);
		bTree.root.left.right.right = new Node(11);
		bTree.root.right.left.left = new Node(12);
		bTree.root.right.left.right = new Node(13);
		bTree.root.right.right.left = new Node(14);
		bTree.root.right.right.right = new Node(15);

		System.out.println("CPN(4, 5): ");
		bTree.findCPN(4, 5);
		System.out.println("CPN(14, 2): ");
		bTree.findCPN(14, 2);
		System.out.println("CPN(5, 11): ");
		bTree.findCPN(5, 11);
		System.out.println("CPN(12, 13): ");
		bTree.findCPN(12, 13);

	}

}
