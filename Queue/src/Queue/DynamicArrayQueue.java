package Queue;

public class DynamicArrayQueue {
	
	private int capacity;
	private int front;
	private int back;
	private char[] array;
	
	public DynamicArrayQueue(){
		capacity = 1;
		front = -1;
		back = -1;
		array = new char[capacity];
	}
	
	public static DynamicArrayQueue createDynamicArrayQueue(){
		return new DynamicArrayQueue();
	}
	
	public boolean isEmpty(){
		return (front == -1);
	}
	
	public boolean isFull(){
		// assume that the array starts at index 0
		return ((back)%(capacity-1) == front);
	}
	
	public int getQueueSize(){
		int size = 0;
		while(array[front]!=('\u0000')){
			size ++;		
			front++;
		}
		return size;
	}
	
	private void resizeQueue(){
		
	}
	
	public void enQueue(){
		
	}
	
	public int deQueue(){
		
	}

}
