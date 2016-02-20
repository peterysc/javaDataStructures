package BSTNode;

public class BSTNode {
	
	public static void main(String[] args) {
		
		BSTNode six = new BSTNode();
		six.setData(6);
		BSTNode two = new BSTNode();
		two.setData(2);
		BSTNode eight = new BSTNode();
		eight.setData(8);
		BSTNode one = new BSTNode();
		one.setData(1);
		BSTNode four = new BSTNode();
		four.setData(4);
		BSTNode three = new BSTNode();
		three.setData(3);
		six.setLeft(two);
		six.setRight(eight);
		two.setLeft(one);
		two.setRight(four);
		one.setLeft(null);
		one.setRight(three);
		eight.setLeft(null);
		eight.setRight(null);
		four.setLeft(null);
		four.setRight(null);
		three.setLeft(null);
		three.setRight(null);

		BSTNode five = insert(six, 5);
		System.out.println(five.getData());
		System.out.println(five.getLeft());
		System.out.println(five.getRight());
		System.out.println(four.getRight().getData());
		
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
		
	// Time complexity: O(n), Space complexity: O(n)
	public static BSTNode insert(BSTNode root, int data){
		if(root == null){
			root  = new BSTNode();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		}
		else{
			if(data<root.getData())
				root.setLeft(insert(root.getLeft(),data));
			else if(data > root.getData()){
				root.setRight(insert(root.getRight(),data));
			}
		}
		
		return root;
	}
}
