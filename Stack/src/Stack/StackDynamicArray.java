package Stack;

public class StackDynamicArray {
	
	private int top;
	private int capacity;
	private int[] array;
	
	public StackDynamicArray(){
		capacity = 1;
		array = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty(){
		// top == -1 represents an empty array
		return (top == -1);
	}
	
	public boolean isStackFull(){
		return (top == array.length);
	}
	
	public void push(int data){
		if(isStackFull()){
			doubleStack();
		}
		array[top] = data;
		top ++;
	}

	private void doubleStack() {
		// TODO Auto-generated method stub
		int newStack[] = new int[capacity*2];
		System.arraycopy(array, 0, newStack, 0, capacity);
		capacity = capacity*2;
		array = newStack;
		
	}
	
	public int pop(){
		if(isEmpty()){
			return -1;
		}
		else{
			int pop = array[top-1];
			top --;
			return pop;
		}
	}
	
	public void deleteStack(){
		top = -1;
	}

}
