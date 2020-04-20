class StacksUsingLinkedList{

	// Linked List implementation to store data
	private class LinkedList{
		int data;
		LinkedList next;
	}

	// Creating a null variable to be initialized inside constructor
	private LinkedList ll = null;

	// Constructor
	StacksUsingLinkedList(){
		ll = new LinkedList();
	}

	// push operations
	public void push(int data){
		LinkedList temp = new LinkedList();
		temp.data = data;
		temp.next = ll;
		ll = temp;
	}

	// pop operations
	public int pop(){
		int temp = ll.data;
		ll = ll.next;
		return temp;
	}

	public boolean isEmpty(){
		return ll == null;
	}

	// Remarks
	// Every operation takes constant time in the worst case.
	// A stack with N items uses ~ 40 N bytes.
}