package linkedlist;

public class Node<T> {
	T key;                 
	Node next = null;      

	public Node(T key) {
		this.key = key;
		this.next = next;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}


