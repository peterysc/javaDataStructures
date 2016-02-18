package CircularLL;

public class CircularLL {
	
	int data;
	private CircularLL next;
	
	public CircularLL(int data){
		this.data = data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setNext(CircularLL next){
		this.next = next;
	}
	
	public CircularLL getNext(){
		return next;
	}
	
	public int getSize(CircularLL head){
		int size = 0;
		CircularLL currentNode = head;
		while(currentNode!=null){
			currentNode = currentNode.getNext();
			size ++;
		}
		return size;
	}
	
	
}
