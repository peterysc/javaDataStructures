package Queue;

public class CircularArrayQueue {
	
	private int front;
	private int back;
	private int capacity; // size = total number of elements in the array
	private char[] array;
	
	private CircularArrayQueue(int size){
		capacity = size;
		front = -1;
		back = -1;
		array = new char[size];
	}

	public static CircularArrayQueue createQueue(int size){
		
		CircularArrayQueue queue = new CircularArrayQueue(size);
		queue.front = 0;
		queue.back = 0;
		
		return queue;
		
	}
	
	public boolean isEmpty(){
		
		return (front == -1);
		
	}
	
	public boolean isFull(){
		// assume that the array starts at index 0
		return ((back)%(capacity-1) == front);
	}
	
	public int getQueueSize(){
		// if the queue is full, the size = capacity
		if(isFull()){
			return capacity;
		}
		// if the queue is empty, the size = 0
		if(isEmpty()){
			return 0;
		}
		if(front > back){
			return ((capacity - (back - front) +1) %capacity);
		}
		return((capacity + (back - front))%capacity);	
	}
	
	public void enQueue(char data) throws QueueOverflowException{
		if(isFull()){
			throw new QueueOverflowException("Queue Overflow");
		}
		array[back] = data;
		back++;
		if(back > capacity-1){
			back = back % capacity;
		}
		
	}
	
	public char deQueue() throws EmptyQueueException{
		if(isEmpty()){
			throw new EmptyQueueException("Queue Empty.");
		}
		// set the element to null in char
		array[front] = '\u0000';
		char deQueueElement = array[front];
		front++;
		if(front > capacity-1){
			front = front % capacity;
		}
		return deQueueElement;
	}
	
	public void deleteQueue(){
		front = -1;
		back = -1;
	}
}
