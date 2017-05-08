package com.list;

import java.util.HashMap;

public class LRUCache {
	int capacity;
    HashMap<Integer, DNode> map = new HashMap<Integer, DNode>();
    DoubleLinkedList dl = new DoubleLinkedList();
    
    public LRUCache(int capacity){
    	this.capacity = capacity;
    }
    
    public void setKey(int key, int value){
    	if(map.containsKey(key)){
    		DNode n = map.get(key);
    		dl.deleteNode(n);
    		n.n = value;
    		dl.insertAtStart(value);
    	}else{
    		DNode created = new DNode(value);
    		if(map.size()>=capacity){
    			map.remove(key);
                dl.deleteAtLast();
                dl.insertAtStart(value);
    		}else{
    			dl.insertAtStart(value);
    		}
    		map.put(key, created);
    	}
    }
    public int get(int key) {
        if(map.containsKey(key)){
            DNode n = map.get(key);
            dl.deleteNode(n);
            dl.insertAtStart(n.n);
            return n.n;
        }
        return -1;
    }
}
