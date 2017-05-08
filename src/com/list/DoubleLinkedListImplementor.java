package com.list;

import com.list.DoubleLinkedList;

public class DoubleLinkedListImplementor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList dl1 = new DoubleLinkedList();
		dl1.insertAtEnd(2);
		dl1.display();
		dl1.deleteAtFirst();
		dl1.display();
		dl1.insertAtStart(4);
		dl1.insertAtStart(6);
		dl1.insertAtStart(7);
		dl1.display();
		dl1.insertAtStart(6);
		dl1.insertAtStart(7);
		dl1.insertAtStart(8);
		dl1.display();
		dl1.reversedisplay();
		dl1.insertAtEnd(5);
		dl1.reversedisplay();
		dl1.display();
		dl1.deleteAtFirst();
		dl1.display();
		dl1.deleteAtLast();
		dl1.display();
	}

}

