package SingleLinkedList;

public class SinglyNode {
	
	private int data;
	private SinglyNode next;
	
	// constructor
	public SinglyNode (int data){
		this.data = data;
	}
	
	// set the data for the current node
	public void setData(int data){
		this.data = data;
	}
	
	// get the data for the current node
	public int getData(){
		return data;
	}
	
	// set the next node to the input
	public void setNext(SinglyNode next){
		this.next = next;
	}
	
	// gets next node
	public SinglyNode getNext(){
		return this.next;
	}
	
	// get the length of the list
	public int getLength(SinglyNode head){
		int size = 0;
		SinglyNode currentNode = head;
		if(head==null){
			return size;
		}
		else{
			while(currentNode!=null){
				size++;
				currentNode = currentNode.getNext();
			}
		}
		return size;
	}
	
	// insert a node into a linkedlist
	// headNode = head of the linkedlist
	// newNode = new node that is being inserted in to the linked list
	// position = the position of the new node being inserted
	public SinglyNode insertNode(SinglyNode headNode, SinglyNode newNode, int position){
		// when the size of linked list = 0
		if(headNode == null){
			return newNode;
		}
		// insert the node at the beginning of the list
		if(position == 1){
			newNode.setNext(headNode);
			headNode = newNode;
		}
		// insert the node in the middle or at the end
		else{
			
			SinglyNode previousNode = headNode;
			int count = 1;
			while(count < position -1){
				previousNode = previousNode.getNext();
			}
			SinglyNode currentNode = previousNode.getNext();
			newNode.setNext(currentNode);
			previousNode.setNext(newNode);
			
		}
		
		return headNode;
	}
	
	public SinglyNode deleteNode(SinglyNode headNode, int position){
		// deleting a node when the size of the linked list is 1
		if(position == 1){
			SinglyNode currentNode = headNode.getNext();
			headNode = null;
			headNode = currentNode;
			return headNode;
		}
		else{
			SinglyNode previousNode = headNode;
			int count = 1;
			while(count < position - 1){
				previousNode = previousNode.getNext();
				count ++;
			}
		
			SinglyNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return headNode;
	}
	
	// delete the entire linked list
	void deleteList(SinglyNode headNode){
		
		SinglyNode nextNode = headNode;
		SinglyNode currentNode = headNode;
		while(currentNode != null){
			nextNode = currentNode.getNext();
			currentNode = null;
			currentNode = nextNode;
		}

	}

}