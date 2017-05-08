package code.monk.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Monk_Order_Food {
	
	Stack<Integer> st = new Stack<>();
	public void push (int n){
		st.push(n);
	}
	public int pop (){
		return st.pop();
	}
	public boolean isEmpty(){
		return st.isEmpty();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Monk_Order_Food m = new Monk_Order_Food();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String l = br.readLine();
            if(l.split(" ").length == 2){
            	m.push(Integer.parseInt(l.split(" ")[1]));
            }else{
            	if(m.isEmpty()){
            		System.out.println("No Food");
            	}else{
            		System.out.println(m.pop());
            	}
            }
        }
	}

}
