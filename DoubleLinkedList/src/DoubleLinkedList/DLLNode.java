package DoubleLinkedList;

public class DLLNode {

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
		DLLNode currentNode = headNode;
		while(currentNode.getNext()!=null){
			size++;
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
