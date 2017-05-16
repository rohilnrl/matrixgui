package lib;

public class Node {

	public Matrix matrix;
	public Node next;
	
	public Node() {
		matrix = null;
		next = null;
	}
	
	public Node(Matrix matrix) {
		this.matrix = matrix;
	}
	
	public Node(Node next) {
		this.next = next;
	}
	
	public Node(Matrix matrix, Node next) {
		this.matrix = matrix;
		this.next = next;
	}
	
	public Matrix getMatrix() {
		return matrix;
	}
	
	public Node getNext() {
		return next;
	}
}
