package com;

public class Node {

	int data;
	Node next;

	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}

}
