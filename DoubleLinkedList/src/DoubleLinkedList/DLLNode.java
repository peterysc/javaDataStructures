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
	int getSize(DLLNode headNode){
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
	DLLNode insertNode(DLLNode headNode, DLLNode newNode, int position){
		// inserting at the very front of the list
		if(position == 1){
			headNode.setPrevious(newNode);
			newNode.setNext(headNode);
			newNode.setPrevious(null);
			return newNode;
		}
		
		return null;
	}
}

