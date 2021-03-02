package myprogrammes;

import java.util.Stack;

public class StackPrograme {
	int array[] = new int[7];
	int top = 0;

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
	}

	private int peek() {
		return array[top];

	}

	private int pop() {
		int x = array[top--];
		System.out.println("element popped from stack=" + x);
		return x;

	}

	private boolean push(int x) {
		top++;
		array[top] = x;
		System.out.println("element pushed into stack:" + x);
		return true;

	}

}
