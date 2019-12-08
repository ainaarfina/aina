import java.util.Scanner;

public class BankSimulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ; 
		
		System.out.print("Enter number of client : ");
		int client = sc.nextInt(); 
		
		System.out.print("Enter number of server: " );
		int server = sc.nextInt(); 
		
		System.out.print("Enter duration for simulation in seconds: ") ;
		int duration = sc.nextInt();
		
		System.out.println(); 
		
		Queue cinQ = new Queue();
		cinQ.simulation(duration, client, server); 
		cinQ.result();

		System.out.println("\n\nDone.");
	}

}