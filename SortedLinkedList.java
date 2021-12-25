package linkedlist;

public class SortedLinkedList<T>{
	Node head = null;


	public void addNode(T key) {
		Node newNode = new Node(key);
		newNode.setNext(head);          
		head = newNode;
	}

	public void sort() {
		Node currentNode = head , nextNode = null;

		int temp_node;
		if(head == null) {
			return;
		}
		else {
			while(currentNode != null) {
				nextNode = currentNode.next;    
				while(nextNode != null) {        
					if(((int)currentNode.key) > ((int)nextNode.key)) {
						temp_node = (int)currentNode.key;         
						currentNode.key = nextNode.key;		    
						nextNode.key = temp_node;               
					}
					nextNode = nextNode.next;
				}
				currentNode = currentNode.next;

			}
			display();          
		}
	}

	public void display() {
		Node currentNode = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(currentNode != null) {
			System.out.print(currentNode.key + "  ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}


