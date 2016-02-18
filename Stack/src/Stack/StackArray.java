package Stack;

public class StackArray {
	private int top;
	private int capacity; // size
	private int[] stack;
	
	public StackArray(){
		capacity = 10;
		stack = new int[capacity];
		top = -1; // -1 indicates an empty stack
	}
	
	public boolean isEmpty(){
		// if the condition is true, then the stack is empty
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return (top == (capacity -1));
	}
	
	public void push(int data){
		if(isStackFull()){
			System.out.println("Stack overflow");
		}
		else{
			stack[top++] = data;
		}
	}
	
	// return the element that is popped
	public int pop(){
		if(isEmpty()){
			System.out.println("The stack is already empty.");
			return 0;
		}
		
		else{
			return (stack[top--]);
		}
	}
	
	void deleteStack(){
		top = -1;
	}
}
