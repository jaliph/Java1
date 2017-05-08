package code.monk.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_Monk {

	Deque<Integer> dq = new LinkedList<>();
	
 	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Queue_Monk qm = new Queue_Monk();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        for (int i = 0; i < N; i++) {
        	String l = br.readLine();
            if(l.split(" ").length == 2){
            	System.out.println(qm.insert(Integer.parseInt(l.split(" ")[1])));
            }else{
            	System.out.println(qm.remove());
            }
        }
	}
	
	public String remove(){
		if(dq.isEmpty()){
			return -1+" "+dq.size();
		}
		return dq.removeLast()+" "+dq.size();
	}
	
	public int insert(int n){
		dq.add(n);
		return dq.size();
	}

}
