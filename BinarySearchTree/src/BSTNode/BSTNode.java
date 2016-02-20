package BSTNode;

public class BSTNode {
	
	public static void main(String[] args) throws NullPointerException {
		
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

		// insert 5 into the BST
		BSTNode five = insert(six, 5);
		System.out.println(five.getData());
		System.out.println(five.getLeft());
		System.out.println(five.getRight());
		System.out.println(four.getRight().getData());
		BSTNode max = new BSTNode();
		BSTNode min = new BSTNode();
		System.out.println(six);
		max = findMax(six);
		min = findMin(six);
		System.out.println(max);
		System.out.println(eight);
		System.out.println(min);
		System.out.println(one);
		
		// tree is now
		//				6
		//			   /  \
		// 		      2		8
		//           / \
		//   		1   4
		//		     \   \
		//			  3   5
		
//		System.out.println("testing for removing");
//		
		six = delete(six,1);
		System.out.println(six.left.data);
		System.out.println(two.left.data);
		six = insert(six,1);
		System.out.println(six.left.data);
		System.out.println(two.left.data);
		System.out.println(three.left.data);
		six = delete(six,1);
	
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
	public static BSTNode findMin(BSTNode root){
		if(root == null){
			return null;
		}
		while(root.getLeft()!=null){
			root = root.getLeft();
		}
		
		return root;
	}
	
	// Time complexity: O(n), space complexity: O(1) however recursive version would require the
	// space complexity of O(n)
	public static BSTNode findMax(BSTNode root){
		if(root == null){
			return null;
		}
		while(root.getRight()!=null){
			root = root.getRight();
		}
		return root;
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
	
	public static BSTNode delete(BSTNode root, int data){
		BSTNode currentNode;
		if(root == null){
			System.out.println("Cannot delete a node in an empty tree");
			return null;
		}
		else if(data > root.data){
			root.right = delete(root.getRight(),data);
		}
		else if(data < root.data){
			root.left = delete(root.getLeft(),data);
		}
		else{		// found the node
			// delete a node with two children
			if(root.left != null && root.right != null){
				currentNode = findMax(root.getLeft());
				root.data = currentNode.data;
				root.left = delete(root.left, root.getData());
			}
			// delete a node with one child
			else if(root.left!=null){
				currentNode = root;
				root = root.getLeft();
				currentNode = null;
			}
			else if(root.right!=null){
				currentNode = root;
				root = root.getRight();
				currentNode = null;
			}
			else{
				root = null;
			}
		}
		return root;
	}
}
