class StacksUsingResizableArrays {
	// array to store data
	private int[] arr;
	// default size of array
	private int size = 2;
	// variable to access index of array
	private int index = 0;
	// constructor to initialize array 
	StacksUsingResizableArrays(){
		arr = new int[size];
	}
	private void resizeArray(int capacity){
		int[] temp = new int[capacity];
		for(int i=0;i<index;i++){
			temp[i] = arr[i];
			// System.out.println(arr[i]);
		}
		arr = temp;
		size = capacity;
	}
	public void push(int data) {
		// Check if array size exceeds the max limit
		// index++;
		if(index == size){
			resizeArray(2 * size);
		}
		arr[index++] = data;
	}
	public int pop() { 
		// Check if stack is empty.... throw stack undeflow exception
		if(isEmpty()){
			System.out.println("Stack Underflow!");
			return 0;
		}
		int ss = arr[--index];
		// if last index is quarter of total size of array then shrink the array by half
		if(index == (size/4) && index > 0){
			resizeArray(size/2);
		}
		
		// arr[index] = null; 
		// --index;
		return ss; 
	} 
	public boolean isEmpty(){
		return index == -1;
	}
}