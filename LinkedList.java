package linkedlist;

public class LinkedList {
	Node head = null;  

	public <T> void addFirst(T key) {             
		Node node = new Node(key);           
		node.setNext(head);           
		head = node;                 
	}

	public <T> void append(T key) {
		Node currentNode = head;       
		while(currentNode.next != null) {       
			currentNode = currentNode.next;
		}
		Node node = new Node(key);               		
		currentNode.next = node;
	}

	public <T> void insertBetween(T previous_key , T key) {
		Node currentNode = head;
		while(currentNode.key != previous_key) {
			currentNode = currentNode.next;         
		}                                           
		Node node = new Node(key);
		node.next = currentNode.next;
		currentNode.next = node;
	}

	public <T> Node popFirst() {
		Node currentNode = head;
		head = head.next;          
		return currentNode;
	}


	public <T> void popLast() {
		Node currentNode = head;
		Node previousToLast = null;
		while(currentNode.next != null) {
			previousToLast = currentNode;
			currentNode = currentNode.next;
		}
		previousToLast.next = null;
	}

	public <T> boolean search(T key) {
		Node currentNode = head;
		while(currentNode != null) {                               
			if(currentNode.key == key) {                                 
				System.out.println("\n\nNode :- " + currentNode.key);   
				return true;
			}
			currentNode = currentNode.next;
		}
		System.out.println("\n\nNode not found");
		return false;
	}

	public <T> boolean searchAndInsert(T previous_key , T insert_key) {
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.key.equals(previous_key)) {
				insertBetween(previous_key , insert_key);     
			}                                                 
			currentNode = currentNode.next;					 
		}
		return false;
	}

	public <T> boolean DeleteByKey(T key) {
		Node currentNode = head;
		Node previousNode = head;
		while(currentNode != null) {
			if(currentNode.key == key) {
				previousNode.next = currentNode.next;         
				size(); 									
				return true;                                
			}												
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		return false;
	}

	public <T> void size() {
		Node curreNode = head;
		int count = 0;
		while(curreNode != null) {             
			count++;
			curreNode = curreNode.next;
		}
		System.out.println("Size of the Linked List :- " + count);
	}

	public <T> void print() {
		Node currentNode = head;
		System.out.println("Linked-List :- ");           
		while(currentNode != null) {                    
			System.out.print(currentNode.key + " --> ");
			currentNode = currentNode.next;         
		}
		System.out.print("null");
	}



	public static void main(String[] args) {

		System.out.println("-----------WELCOME TO LINKED LIST-------------");

		SortedLinkedList sortedLinkedList = new SortedLinkedList();

		sortedLinkedList.addNode(56);    
		sortedLinkedList.addNode(30);
		sortedLinkedList.addNode(40);
		sortedLinkedList.addNode(70);

		System.out.println("Linked List before sorting :-");
		sortedLinkedList.display();

		System.out.println("\nLinked List after sorting :-");
		sortedLinkedList.sort();

	}	
}
