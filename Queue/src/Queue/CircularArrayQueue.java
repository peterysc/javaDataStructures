package Queue;

public class CircularArrayQueue {
	
	private int front;
	private int back;
	private int capacity; // size = total number of elements in the array
	private int[] array;
	
	private CircularArrayQueue(int size){
		capacity = size;
		front = -1;
		back = -1;
		array = new int[size];
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
		return ((back+1)%capacity == front);
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
			return ((capacity - (front - back) +1) %capacity);
		}
		return((capacity + (front - back))%capacity);	
	}
	
	public void enQueue(int data){
		if(back == 0){
			array[back] = data;
			back ++;
		}
		
		array[back] = data;
		back++;
		
	}
	
	public int deQueue(){
		return 0;
	}
	
	public void deleteQueue(){
		front = -1;
		back = -1;
	}
}
