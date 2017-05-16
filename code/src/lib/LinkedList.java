package lib;

public class LinkedList {

	public Node start;
	public Node end;
	
	public LinkedList() {
		start = null;
		end = null;
	}
	
	public LinkedList(Node start) {
		this.start = start;
		this.end = start;
	}
	
	public boolean isEmpty() {
		return (start == null);
	}
	
	/**
	 * Adds an item to the end of the list.
	 * 
	 * @param item
	 */
	public void add(Node item) {
		if (this.isEmpty()) {
			return;
		}
		
		if (start == null) {
			start = end = item;
			return;
		}
		
		end.next = item;
		end = item;
	}
	
	/**
	 * Adds an item to the front of the list.
	 * 
	 * @param item
	 */
	public void addFront(Node item) {
		if (this.isEmpty()) {
			return;
		}
		
		if (start == null) {
			add(item);
		}
		
		Node tempNode = start;
		start = item;
		start.next = tempNode;
	}
	
	public void del(Matrix matrix) {
		if (start.equals(matrix)) {
			start = start.next;
		}
		
		for (Node i = start; i != null; i = i.next) {
			if (matrix.equals(i.next)) {
				
			}
		}
	}
	
	public void del(int index) {
		for (Node i = start; i.next != null; i = i.next) {
			
		}
	}
}
