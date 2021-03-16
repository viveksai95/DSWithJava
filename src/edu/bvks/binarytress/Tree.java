package edu.bvks.binarytress;

/**
 * Implementation of BINARY TREE
 * 
 * @author VivekVineeth
 *
 */

public class Tree {

	private class Node {
		private int value;
		private Node leftChild, rightChild;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node root;

	/**
	 * Inserts the value in the Binary Search Tree
	 * 
	 * @param value
	 */

	public void insert(int value) {

		// Checks if Tree is empty and initializes if true
		if (root == null) {
			root = new Node(value);
			return;
		}

		Node current = root;

		// Iterates through all the elements of the tree
		while (true) {
			// Logic to find the matching position to insert the node
			if (value < current.value) {
				if (current.leftChild == null) {
					current.leftChild = new Node(value);
					break;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = new Node(value);
					break;
				}
				current = current.rightChild;
			}
		}

	}

	/**
	 * Checks if the given value is present in the tree and returns back the status
	 * 
	 * @param value
	 * @return isFound
	 */

	public boolean find(int value) {

		Node current = root;

		// Iterates through all the elements of the tree
		while (current != null) {

			if (value < current.value) {
				current = current.leftChild;
			} else if (value > current.value) {
				current = current.rightChild;
			} else {
				// `value` found
				return true;
			}
		}
		// `value` not found
		return false;
	}

	// TODO: Note down all the edge cases and check the working functionality of the
	// code.
	// TODO: To implement generic Tree Interface, accepting all data types
	// TODO: To implement delete operation for B.S.T Later.

}
