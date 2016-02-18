package Stack;

import java.util.EmptyStackException;

import SingleLinkedList.SinglyNode;

public class StackLL extends SinglyNode {
	
	private SinglyNode headNode;
	
	public StackLL(int data) {
		super(data);
		this.headNode = new SinglyNode(data);
		
	}

	public void push(int data){
		if(headNode == null){
			headNode = new SinglyNode(data);
		}
		else if(headNode.getData() == -1){
			headNode.setData(data);
		}
		else{
			SinglyNode newNode = new SinglyNode(data);
			newNode.setNext(headNode);
			headNode = newNode;
		}
	}
	
	public int top(){
		if(headNode == null){
			return -1;
		}
		
		else{
			return headNode.getData();
		}
	}
	
	public int pop(){
		if(headNode == null){
			throw new EmptyStackException();
		}
		else{
			int data = headNode.getData();
			headNode = headNode.getNext();
			return data;
		}
	}
	
	public boolean isEmpty(){
		if(headNode == null){
			return true;
		}
		else
			return false;
	}
	
	public void deleteStack(){
		headNode = null;
	}
}
