
public class Client {
		private int arrivalTime;
  
		private int serviceTime = 0;
		
		private int intervalTime = 0; 
		
		private int clientNumber;
	    
	public Client(int clock, int clientArrival, int serviceTime,int intervalTime) {
		
		arrivalTime = clock ;
		
		clientNumber = clientArrival ; 
		
		this.serviceTime = serviceTime ;
		
		this.intervalTime = intervalTime;
	}
	
	public int getArrivalTime() {
        
		return arrivalTime;
	}

	public int getServiceTime() {
        
		return serviceTime;
    }
    
	public int getIntervalTime() {
        
		return intervalTime;
    }
    
    public int getCustomerNumber() {
        
    	return clientNumber;
    }
 
}