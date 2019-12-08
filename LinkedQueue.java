
import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueInterface<Client> {
	
		private Node firstNode; // References node at front of queue 
		
		private Node lastNode;  // References node at back of queue 	
		
	public LinkedQueue() {	
		
		firstNode = null;		
		
		lastNode = null;
		
	} // end default constructor
		
	public void enqueue(Client newEntry) {
		
		Node newNode = new Node(newEntry, null);
		
			if (isEmpty())
					
				firstNode = newNode;
				
			else
					
				lastNode.setNextNode(newNode);	
			
				lastNode = newNode;
	}
		
	
	public Client getFront() {
			
		if (isEmpty())
				
			throw new EmptyStackException();
			
		else
	         
			return firstNode.getData();

	} // end getFront

		
	public Client dequeue() {
		   
		Client front = getFront();  // Might throw EmptyQueueException 
		
		assert firstNode != null;  
		
		firstNode.setData(null);	      
		
		firstNode = firstNode.getNextNode();	
		
			if (firstNode == null)
	         
				lastNode = null;
					
			return front;
		
	} // end dequeue
			
		
	public boolean isEmpty() {
			
		return (firstNode == null) && (lastNode == null);
		
	} // end isEmpty
		
		
	public void clear() {
			
		firstNode = null;
		
		lastNode = null;
		
	} // end clear
	

	private class Node {
			
			private Client data; // Entry in queue		
		
			private Node next; // Link to next node
		
		private Node(Client dataPortion) {
				
			data = dataPortion;	
			
			next = null;	
			
		} // end constructor
			

		private Node(Client dataPortion, Node linkPortion) {
				
			data = dataPortion;		
			
			next = linkPortion;	
			
		} // end constructor
			

		private Client getData(){
				
			return data;
			
		} // end getData
		

		private void setData(Client newData) {
				
			data = newData;
			
		} // end setData

			
		private Node getNextNode() {
				
			return next;
			
		} // end getNextNode
			
			
		private void setNextNode(Node nextNode) {
					
			next = nextNode;
			
		} // end setNextNode
		
	} // end Node

} // end Linkedqueue
