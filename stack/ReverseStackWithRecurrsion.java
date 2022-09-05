package stack;

import java.util.Stack;

public class ReverseStackWithRecurrsion {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 1 ; i <= 5 ; i++ ) {
			st.push(i);
		}
		
		reverse(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		
		if(st.isEmpty()) {
			return;
		}
		
		int top = st.pop();
		reverse(st);
		insertAtBottom(st , top);
		
	}

	private static void insertAtBottom(Stack<Integer> st, int top) {
		// TODO Auto-generated method stub
		
		if(st.isEmpty()) {
			st.push(top);
			return;
		}
		
		int back = st.pop();
		insertAtBottom(st, top);
		st.push(back);
		
	}

}
