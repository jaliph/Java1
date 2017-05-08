package com.list;

class LinkedList{
	private Node Head;
	
	LinkedList (){
		this.Head = null;
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return Head == null;
	}
	
	public void insertAtStart(int data){
		Node n = new Node(data);
		n.next = this.Head;
		Head = n;
	}
	
	public void display(){
		Node temp = Head;
		System.out.println("Values is ");
		while( temp !=  null){
			System.out.print( + temp.x + " => ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void reversedisplay(){
		Node temp = Head;
		print(temp);
	}
	
	public void print(Node n){
		if(n != null){
			print(n.next);
			System.out.print(n.x + " => ");
		}else{
			return;
		}
	}
	
	public void insertAtEnd(int data){
		Node n = new Node(data);
		if(!isEmpty()){
			Node temp = Head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = n;
		}else{
			insertAtStart(data);
		}
	}
	
	public int deleteAtFirst(){
		if(isEmpty()){
			System.out.println("Cannot Delete in Empty List");
			return 0;
		}else{
			int tempVal = Head.x;
			Head = Head.next;
			return tempVal;
		}
		
	}
	
	public int deleteAtEnd(){
		if(isEmpty()){
			System.out.println("Cannot Delete in Empty List");
			return 0;
		}else{
			int tempVal;
			Node temp = Head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			tempVal = temp.next.x;
			temp.next = null;
			return tempVal;
		}
	}
}