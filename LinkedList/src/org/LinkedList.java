package org;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		node.setNext(null);
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}

	public void show() {
		Node node = head;
		while (node.getNext() != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println(node.getData());
	}

	public int size() {
		Node node = head;
		int size = 0;
		while (node.getNext() != null) {
			node = node.getNext();
			size++;
		}
		return size;
	}

	public void getMiddle(LinkedList linkedList) {
		Node node = head;
		int size = (linkedList.size() / 2);
		for (int i = 0; i < size; i++) {
			node = node.getNext();
		}
		System.out.println(node.getData());
	}

}
