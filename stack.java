package POP;

public class stack {
	
	int top;
	int max;
	public char[] stack;

	public stack (int stackSize) {
		this.stack = new char[stackSize];
		this.max = this.stack.length;
		this.top = 0;

	}
	public void push(char valor) {
		if(top == max) {
			System.out.println("Stack is full");
		}else {
			stack[top] = valor;
			top++;
		}
	}
	public void pop() {
		if(top == 0) {
			System.out.println("Stack is empty");

			} else {
				System.out.println(stack[(top-1)]);
				stack[(top-1)] = 0;
				top--;
		}
	}
	public void delete () {
		if(top == 0) {
			System.out.println("#");
		}else {
			System.out.println(stack[0]);
			for(int i = 0; i < stack.length-1; i++) {
				stack[i] = stack[(i+1)];
			}
		}
	}


}
