package DoubleLinkedList;

public class DLLNode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLLNode head = new DLLNode(2);
		DLLNode second = new DLLNode(10);
		DLLNode third = new DLLNode(12);
		DLLNode fourth = new DLLNode(13);
		DLLNode fifth = new DLLNode(14);
		DLLNode sixth = new DLLNode(10);
		head.setPrevious(null);
		head.setNext(second);
		second.setPrevious(head);
		second.setNext(third);
		third.setNext(fourth);
		third.setPrevious(second);
		fourth.setNext(fifth);
		fourth.setPrevious(third);
		fifth.setNext(sixth);
		fifth.setPrevious(fourth);
		sixth.setNext(null);
		sixth.setPrevious(fifth);
		
		int size;
		System.out.println("Before checking the size");
		size = head.getSize(head);
		System.out.println(size);
		DLLNode newNode = new DLLNode(55);
		insertNode(head, newNode,3);
		System.out.println(newNode.getNext());
		System.out.println(newNode.getPrevious());
		DLLNode testing = new DLLNode(123);
		testing.setNext(head);
		head.setPrevious(testing);
		System.out.println(head.getPrevious());
		System.out.println(testing.getPrevious());
		
	}

	private int data;
	private DLLNode next;
	private DLLNode prev;
	
	// constructor
	public DLLNode(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(int data){
		return data;
	}
	
	// set the node as a next for the current node
	public void setNext(DLLNode node){
		this.next = node;
	}
	
	// get the pointer for the next node
	public DLLNode getNext(){
		return this.next;
	}
	
	// set the node as a previous for the current node
	public void setPrevious(DLLNode node){
		this.prev = node;
	}
	
	public DLLNode getPrevious(){
		return this.prev;
	}
	
	// get the size of DLL
	static int getSize(DLLNode headNode){
		int size = 0;
		if(headNode==null){
			return size;
		}
		else{
			DLLNode currentNode = headNode;
			while(currentNode!=null){
				size++;
				currentNode = currentNode.getNext();
			}
		}
		return size;
	}
	
    // insert node into DLL
	// headNode = head node of the DLL
	// newNode = new node being inserted into DLL
	// position = position of the node being inserted
	static DLLNode insertNode(DLLNode headNode, DLLNode newNode, int position){
		// nothing in the linked list
		if(headNode == null){
			return newNode;
		}
		int size = getSize(headNode);
		if(position > size +1 || position < 1){
			System.out.println("Position of newNode is invalid." + "The valid inputs are 1 to " + (size+1));
			return headNode;
		}
		// inserting at the very front of the list
		if(position == 1){
			headNode.setPrevious(newNode);
			newNode.setNext(headNode);
			newNode.setPrevious(null);
			return newNode;
		}
		
		// inserting at the middle or end
		else{
			int count = 1;
			DLLNode currentNode = headNode;
			while(count < position -1){
				currentNode = currentNode.getNext();
				count++;
			}
			DLLNode nextNode = currentNode.getNext();
			nextNode.setPrevious(newNode);
			currentNode.setNext(newNode);
			newNode.setPrevious(currentNode);
			newNode.setNext(nextNode);
			
		}
		return headNode;
	} 
}

