package com.demo;

class Node {
	int value;
	Node nextLocation;

	Node(int value) {
		this.value = value;
		this.nextLocation = null;
	}

	public static void printList(Node head) {
		Node current = head;

		while (current != null) {
			System.out.print(current.value);

			if (current.nextLocation != null)
				System.out.print(" : ");

			current = current.nextLocation;
		}

		System.out.println(" : null");
	}
}

public class LinkedList {
	public static void main(String[] args) {

		Node objNode1 = new Node(1);
		Node objNode2 = new Node(2);
		Node objNode3 = new Node(3);
		Node objNode4 = new Node(4);
		Node objNode5 = new Node(5);

		objNode1.nextLocation = objNode2;
		objNode2.nextLocation = objNode3;
		objNode3.nextLocation = objNode4;
		objNode4.nextLocation = objNode5;

		Node objHead = objNode1;

		Node.printList(objHead);
	}
}