class StackOfStrings { 
	 
	String stack[] = new String[100];  

	int index = -1; 

	void push(String ele) { 
		if(index >= 100) { 
			System.out.println("Stack Overflow"); 
			return; 
		} 
		index++; 
		stack[index] = ele; 
	} 

	String pop() { 
		if (index<0) { 
			return "Stack Underflow";  
		} 
		String ss = stack[index--]; 
		return ss; 
	} 

	boolean isEmpty() { 
		if(index<0){ 
			return true; 
		} 
		return false; 
	} 

	int size() { 
		return index; 
	} 

	int peek() { 
		if(top < 0) { 
			System.out.println("Stack Empty"); 
			return 0; 
		}  
		return stack[index]; 
	} 
} 