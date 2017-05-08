package com.list;

class DoubleLinkedList{
	private DNode Head;
	private DNode Tail;
	
	public DoubleLinkedList() {
		this.Head = null;
	}
	
	public boolean isEmpty(){
		return Head == null;
	}
	
	public void insertAtStart(int data){
		DNode n = new DNode(data);
		if(isEmpty()){
			Tail = n;
		}else{
			Head.prev = n;
		}
		n.next = Head;
		Head = n;
	}
	
	public int deleteAtFirst(){
		if(isEmpty()){
			System.out.println("Can't delete a Empty List");
			return 0;
		}else{
			int tempVal = Head.n;
			if(Head==Tail){
				Head = Head.next;
				Tail = null;
			}else{
				Head.next.prev = null;
				Head = Head.next;
			}
			return tempVal;
		}
	}
	
	public int deleteAtLast(){
		if(isEmpty()){
			System.out.println("Can't delete a Empty List");
			return 0;
		}else{
			if(Head==Tail){
				int tempVal = Head.n;
				Head = Head.next;
				Tail = null;
				return tempVal;
			}else{
				int tempVal = Tail.n;
				Tail.prev.next = null;
				Tail = Tail.prev;
				return tempVal;
			}
		}
	}
	
	public int deleteNode(DNode n){
		int tempVal = n.n;
		if(n.prev == null){
			Head = Head.next;
			Tail = null;
		} else if(n.next == null){
			Tail = n.prev;
		} else {
			n.prev.next = n.next;
			n.next.prev = n.prev;
			n = n.next;
		}
		return tempVal;
	}
	
	public void insertAtEnd(int data){
		DNode n = new DNode(data);
		if(isEmpty()){
			insertAtStart(data);
		}else{
			Tail.next = n;
			n.prev = Tail;
			Tail = n;
		}
	}
	
	public void display(){
		DNode temp = Head;
		System.out.println("Values is ");
		while( temp !=  null){
			System.out.print( + temp.n + " => ");
			temp = temp.next;
		}
		System.out.println("XNULLX");
	}
	
	public void reversedisplay(){
		DNode temp = Head;
		
		while( temp.next !=  null){
			temp = temp.next;
		}
		
		System.out.println("Values is ");
		while(temp != null ){
			System.out.print( + temp.n + " => ");
			temp = temp.prev;
		}
		System.out.println("XNULLX");
	}
	
}