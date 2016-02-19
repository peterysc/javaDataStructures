package BinaryTreeNode;

import java.util.Stack;

public class BinaryTreeNode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode one = new BinaryTreeNode();
		BinaryTreeNode two = new BinaryTreeNode();
		BinaryTreeNode three = new BinaryTreeNode();
		BinaryTreeNode four = new BinaryTreeNode();
		BinaryTreeNode five = new BinaryTreeNode();
		BinaryTreeNode six = new BinaryTreeNode();
		BinaryTreeNode seven = new BinaryTreeNode();
		
		// create a binary tree with 
		//			1
		//		   /  \
		//      2       3
		//     /  \    / \
		//    4    5   6   7
		
 		one.setLeft(two);
		one.setRight(three);
		one.setData('1');
		two.setLeft(four);
		two.setRight(five);
		two.setData('2');
		three.setLeft(six);
		three.setRight(seven);
		three.setData('3');
		four.setLeft(null);
		four.setRight(null);
		four.setData('4');
		five.setLeft(null);
		five.setRight(null);
		five.setData('5');
		six.setLeft(null);
		six.setRight(null);
		six.setData('6');
		seven.setLeft(null);
		seven.setRight(null);
		seven.setData('7');
		
		System.out.println("PreOrderNow");
		preOrder(one);
		System.out.println("PreOrder No Recursion");
		nonrecursivePreOrder(one);
		System.out.println("InOrderNow");
		inOrder(one);
		System.out.println("InOrder No Recursion");
		
		System.out.println("PostOrderNow");
		postOrder(one);
		System.out.println("PostOrder No Recursion");
		
	}
	
	private char data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public char getData(){
		return data;
	}
	
	public void setData(char data){
		this.data = data;
	}
	
	public BinaryTreeNode getLeft(){
		return left;
	}
	
	public void setLeft(BinaryTreeNode left){
		this.left = left;
	}
	
	public BinaryTreeNode getRight(){
		return right;
	}
	
	public void setRight(BinaryTreeNode right){
		this.right = right;
	}
	
	public static void preOrder(BinaryTreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public static void nonrecursivePreOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		while(!stack.empty()){
			BinaryTreeNode n = stack.pop();
			System.out.println(n.data);
			if(n.right!=null){
				stack.push(n.right);
			}
			if(n.left!=null){
				stack.push(n.left);
			}
		}
	}
	
	public static void inOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		inOrder(root.getLeft());
		System.out.println(root.data);
		inOrder(root.getRight());
	}
	
	public static void nonrecursiveInOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
	}
	
	public static void postOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.println(root.data);
	}
	
	public static void nonrecursivePostOrder(BinaryTreeNode root){
		
	}
}
