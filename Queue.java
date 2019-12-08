
public class Queue {
	
		private QueueInterface<Client> q;   
	
		private int clientArrival; 
	
		private int numberServed;  
	
		private int totalTimeWaiting ;
	
		int intervalTime;

	
	public Queue() {

	} // end default constructor
	
	public void simulation(int duration, int client, int server) {
		
		q = new LinkedQueue<>();
		
		int[] serviceTimeLeft = new int[server]; 

		int intervalTime = (int)(30 + Math.random() * 16);
		
		
        
			
		for (int clock = 0; clock < duration ; clock++) {
	        
			int serviceTime = (int)(120 + Math.random() * 481);
			
			if (clock == 0  || clientArrival < client ) {
				
			clientArrival++;
			
			//enqueue client 
	        Client nextArrival = new Client(clock, clientArrival, serviceTime,intervalTime);
	        
	        q.enqueue(nextArrival);
	        
	        System.out.println("Client " + clientArrival + " enters line at time " + intervalTime + ". The service time is " + serviceTime);
	        
		} // end if
		
		for (int i = 0 ; i < server ; i++ ) {
			
			if (serviceTimeLeft[i] > 0) { 
				
	            serviceTimeLeft[i]--;
	            
			}
			else if (!q.isEmpty()) {
	            
				Client nextClient = q.dequeue();  
			
				serviceTimeLeft[i] = nextClient.getServiceTime() - 1;
				
				int waitingTime = clock - nextClient.getArrivalTime();
				
				totalTimeWaiting = totalTimeWaiting + waitingTime;
			
				numberServed++;
				
				System.out.println("Client " + nextClient.getCustomerNumber() + " begins service at time " + intervalTime + ". Time waited is " + waitingTime);
			     

			} // end else if
			
		} // end for 
		
		intervalTime++;
		
	} // end for

} // end simulate

	   /** Displays summary results of the simulation. */ 
	   
	public void result() {
			
		System.out.println();
	      
		System.out.println("Number served = " + numberServed);
	     
		System.out.println("Total time waited = " + totalTimeWaiting);
	      
		double averageTimeWaited = ((double)totalTimeWaiting) / numberServed;
	      
		System.out.println("Average time waited = " + averageTimeWaited);
	      
		int leftInLine = clientArrival - numberServed;
	      
		System.out.println("Number left in line = " + leftInLine);
	   
	} // end displayResults

}// end WaitLine
