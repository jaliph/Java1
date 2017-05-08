package com.list;

public class SingleLinkedListImplementor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.insertAtEnd(7);
		l1.insertAtStart(5);
		l1.insertAtStart(6);
		l1.insertAtStart(1);
		l1.insertAtStart(2);
		l1.insertAtStart(3);
		l1.display();
		l1.deleteAtEnd();
		l1.display();
		l1.reversedisplay();
	}
}

