package BinaryTreeNode;

import java.util.EmptyStackException;

import BinaryTreeNode.SinglyNode;

public class StackLL extends SinglyNode {
	
	private SinglyNode headNode;
	
	public StackLL() {
		super();
		this.headNode = new SinglyNode();
		
	}

	public void push(char data){
		if(headNode == null){
			headNode = new SinglyNode();
		}
		else if(headNode.getData() == -1){
			headNode.setData(data);
		}
		else{
			SinglyNode newNode = new SinglyNode();
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
	
	public char pop(){
		if(headNode == null){
			throw new EmptyStackException();
		}
		else{
			char data = headNode.getData();
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
