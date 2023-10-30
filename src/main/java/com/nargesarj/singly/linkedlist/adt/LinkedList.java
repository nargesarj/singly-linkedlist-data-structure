package com.nargesarj.singly.linkedlist.adt;

import com.nargesarj.singly.linkedlist.impl.Node;

public interface LinkedList<E> {

	Node<E> get(int index);
	
	boolean isEmpty();

	void addFirst(E value);

	void addLast(E value);

	void removeFirst();

	void removeLast();

	Node<E> head();

	Node<E> tail();

	int size();

}
