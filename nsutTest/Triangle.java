package nsutTest;

import java.util.ArrayList;

import linkedList.Node;

public class Triangle {
	
	
	static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
		ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(first != null){
            ar1.add(first.data);
            first = first.next;
        }
        
        while(second != null){
            ar2.add(second.data);
            second = second.next;
        }
        
        int maxSize = Math.max(ar1.size() , ar2.size());
        int carry = 0;
        for(int i = 0 ; i < maxSize; i++){
            int fir = 0;
            int sec = 0;
            if(ar1.size() - i > 0){
                fir = ar1.get(i);
            }
            if(ar2.size() - i > 0){
                sec = ar2.get(i);
            }
            
            int sum = (fir + sec + carry)%10;
            carry = (fir + sec + carry)/10;
            ans.add(sum);
        }
        if(carry != 0){
            ans.add(carry);
        }
        
        Node head = new Node(ans.get(0) , null);
        Node temp = head;
        for(int i = 1 ; i < ans.size() ; i++) {
           Node newNode = new Node(ans.get(i) , null);
           temp.next = newNode;
           temp = newNode;
       }
       
       return head;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
