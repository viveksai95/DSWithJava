package edu.bvks.binarytress;

import java.util.LinkedList;
import java.util.Queue;

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
	 * Complexity - O(log(n))
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
	 * Complexity - O(log(n))
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

	/**
	 * Pre-order Traversal for B.S.T => ROOT, LEFT, RIGHT
	 */
	public void traversePreOrder() {
		this.traversePreOrder(root);
	}

	private void traversePreOrder(Node root) {

		if (root == null)
			return;

		System.out.println(root.value);
		traversePreOrder(root.leftChild);
		traversePreOrder(root.rightChild);

	}

	/**
	 * In-order Traversal for B.S.T => LEFT, ROOT, RIGHT
	 */

	public void traverseInOrder() {
		this.traverseInOrder(root);
	}

	private void traverseInOrder(Node root) {

		if (root == null)
			return;

		traverseInOrder(root.leftChild);
		System.out.println(root.value);
		traverseInOrder(root.rightChild);

	}

	/**
	 * Post-order Traversal for B.S.T => LEFT, RIGHT, ROOT
	 */

	public void traversePostOrder() {
		this.traversePostOrder(root);
	}

	private void traversePostOrder(Node root) {

		if (root == null)
			return;

		traversePostOrder(root.leftChild);
		traversePostOrder(root.rightChild);
		System.out.println(root.value);

	}

	// TODO: Note down all the edge cases and check the working functionality of the
	// code.
	// TODO: To implement generic Tree Interface, accepting all data types
	// TODO: To implement delete operation for B.S.T Later.
	// NOTE: In B.S.T the IN-ORDER-TRAVERSAL gives list of all the elements in
	// ascending order
	// Made a blunder mistake, after copy pasting pre to post and in, forgot to
	// change recursive function names, which totally wasted my time. make sure not
	// to repeat this bro

	public void traverseLevelOrder() {
		this.traverseLevelOrder(root);
	}

	private void traverseLevelOrder(Node root) {
		if (root == null)
			return;
		Node temp = root;
		Queue<Node> queue = new LinkedList<>();

		queue.add(temp);
		while (!queue.isEmpty()) {
			Node current = queue.poll();
			if (current != null) {
				System.out.println(current.value);
			}
			if (current != null && current.leftChild != null) {
				queue.add(current.leftChild);
			}
			if (current != null && current.rightChild != null) {
				queue.add(current.rightChild);
			}
		}

	}

}
