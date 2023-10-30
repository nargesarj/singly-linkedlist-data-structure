package com.nargesarj.singly.linkedlist.impl;

import com.nargesarj.singly.linkedlist.adt.LinkedList;

public class SinglyLinkedList<E> implements LinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public Node<E> getTail() {
		return tail;
	}

	public void setTail(Node<E> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Node<E> get(int index) {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException(index);
		Node<E> pointerNode = head().getNext();
		for (int i = 0; i < size; i++) {
			if (i == index)
				return pointerNode;
			pointerNode = pointerNode.getNext();
		}
		throw new ArrayIndexOutOfBoundsException(index);
	}

	public void addFirst(E value) {
		Node<E> newNode = new Node<E>(value, null);
		if (isEmpty()) {
			this.head = new Node<>(null, newNode);
			this.tail = new Node<>(null, newNode);
		} else {
			newNode.setNext(firstNode());
			head.setNext(newNode);
		}
		this.size++;
	}

	public void addLast(E value) {
		Node<E> newNode = new Node<E>(value, null);
		if (isEmpty()) {
			this.head = new Node<>(null, newNode);
			this.tail = new Node<>(null, newNode);
		} else {
			lastNode().setNext(newNode);
			tail.setNext(newNode);
		}
		this.size++;
	}

	private Node<E> firstNode() {
		return head.getNext();
	}

	private Node<E> lastNode() {
		return tail.getNext();
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			head.setNext(head().getNext().getNext());
			this.size--;
		}
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node<E> newLastNode = get(this.size - 2);
			tail.setNext(newLastNode);
			this.size--;
		}
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public Node<E> head() {
		return this.head;
	}

	public Node<E> tail() {
		return this.tail;
	}

	public int size() {
		return this.size;
	}

}
