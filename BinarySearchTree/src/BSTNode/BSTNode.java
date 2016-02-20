package BSTNode;

public class BSTNode {
	
	public static void main(String[] args) {
		
		
		
		
		
	}
	
	private int data;
	private BSTNode left;
	private BSTNode right;
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public BSTNode getLeft(){
		return left;
	}
	
	public BSTNode getRight(){
		return right;
	}
	
	public void setLeft(BSTNode left){
		this.left = left;
	}
	
	public void setRight(BSTNode right){
		this.right = right;
	}
	
	public BSTNode find(BSTNode root, int data){
		if(root == null){
			return null;
		}
		
		BSTNode currentNode = root;
		int currentNodeData = currentNode.getData();
		
		// root data is equal to the data looking for
		if(currentNodeData == data){
			return root;
		}
		while(currentNode != null){
			// traverse left subtree if data < currentNodeData
			if(currentNodeData > data){
				currentNode = currentNode.getLeft();
				currentNodeData = currentNode.getData();
			}
			// traverse right subtree if data > currentNodeData
			if(currentNodeData < data){
				currentNode = currentNode.getRight();
				currentNodeData = currentNode.getData();
			}
			if(currentNodeData == data){
				return currentNode;
			}
		}
		
		// nothing found
		
		return null;
	}
	
	// Time complexity: O(n), space complexity: O(1) however recursive version would require the
	// space complexity of O(n)
	public BSTNode findMin(BSTNode root){
		BSTNode currentNode = root;
		if(currentNode == null){
			return null;
		}
		while(currentNode!=null){
			currentNode = currentNode.getLeft();
		}
		
		return currentNode;
	}
	
	// Time complexity: O(n), space complexity: O(1) however recursive version would require the
	// space complexity of O(n)
	public BSTNode findMax(BSTNode root){
		BSTNode currentNode = root;
		if(currentNode == null){
			return null;
		}
		while(currentNode!=null){
			currentNode = currentNode.getRight();
		}
		return currentNode;
	}
}
