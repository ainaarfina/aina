
public interface QueueInterface<T> {
	  
	/** Adds a new entry to the back of this queue.
	      
	@param newEntry  An object to be added. */
	  
	
	public void enqueue(T newEntry);  
	  
	/** Removes and returns the entry at the front of this queue.
	      
	@return  The object at the front of the queue. 
	      
	@throws  EmptyQueueException if the queue is empty before the operation. */
	  

	public T dequeue();
	  
	/**  Retrieves the entry at the front of this queue.
	      
	@return  The object at the front of the queue.
	      
	@throws  EmptyQueueException if the queue is empty. */
	  

	public boolean isEmpty();
	  
	  /** Removes all entries from this queue. */
	  
} // end QueueInterface