package edu.bvks.driver;

import edu.bvks.binarytress.Tree;

public class BinaryTreeDriver {

	public static void main(String[] args) {

		Tree tree = new Tree();

		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
		tree.insert(9);
		tree.insert(10);

		System.out.println(tree.find(11)); // false
		System.out.println(tree.find(1)); // true
		System.out.println(tree.find(5)); // true
		System.out.println(tree.find(60)); // false

	}

}
