package com.nargesarj.singly.linkedlist.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nargesarj.singly.linkedlist.adt.LinkedList;

public class SinglyLinkedListTest<E> {

	@Test
	public void testCreateLinkedList_whenCreateLinkedList_thenSizeHeadTailMustBeNull() {

		// Arrange
		LinkedList<String> linkedList;

		// Act
		linkedList = new SinglyLinkedList<>();

		// Assert
		assertEquals(null, linkedList.head());
		assertEquals(null, linkedList.tail());
		assertEquals(0, linkedList.size());

	}

	@Test
	public void testAddFirst_whenAddFirst_thenJustOneNodeMustBeAddewd() {

		// Arrange
		LinkedList<String> linkedList = new SinglyLinkedList<>();

		// Act
		linkedList.addFirst("Sara");

		// Assert
		assertEquals("Sara", linkedList.head().getNext().getValue(), "It must be Sara.");
		assertEquals(1, linkedList.size(), "It must be 2.");

	}

	@Test
	public void testAddLast_whenAddLast_thenJustOneNodeMustBeAddewdToLast() {

		// Arrange
		LinkedList<String> linkedList = new SinglyLinkedList<>();

		// Act
		linkedList.addLast("Sara");

		// Assert
		assertEquals("Sara", linkedList.tail().getNext().getValue(), "It must be Sara.");
		assertEquals(1, linkedList.size(), "It must be 1.");

	}

	@Test
	public void testRemoveFirst_whenRemoveFirst_thenJustOneNodeMustBeRemovedFromFirst() {

		// Arrange
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
		singlyLinkedList.addFirst("Sara");

		// Act
		singlyLinkedList.removeFirst();

		// Assert
		assertEquals(null, singlyLinkedList.getHead());
		assertEquals(0, singlyLinkedList.getSize(), "It must be 1.");

	}

	@Test
	public void testRemoveLast_whenRemoveLast_thenJustOneNodeMustBeRemovedFromLast() {

		// Arrange
		LinkedList<String> linkedList = new SinglyLinkedList<>();
		linkedList.addLast("Sara");

		// Act
		linkedList.removeLast();

		// Assert
		assertEquals(null, linkedList.head(), "It must be null.");
		assertEquals(0, linkedList.size(), "It must be 0.");

	}

	@Test
	public void testGetValueBySpecificIndex_whenGetValueByIndex_thenReturnCorrectValue() {

		// Arrange
		SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
		linkedList.addFirst("Sara");
		linkedList.addFirst("Nila");

		// Act
		String firstValue = linkedList.get(0).getValue();
		String secondValue = linkedList.get(1).getValue();

		// Assert
		assertEquals("Nila", firstValue);
		assertEquals("Sara", secondValue);

	}

}
