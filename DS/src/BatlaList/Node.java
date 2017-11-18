package BatlaList;

public class Node {

	int data;
	Node next;
	String name;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", name=" + name + "]\n";
	}
	
	
	
		
	
}
