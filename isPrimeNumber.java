package week1.day2.homework;

public class isPrimeNumber {

	static int n = 13;
	static boolean isPrime = true;
	
	public static void main(String args[]) {
		
		for(int i=2; i<n; i++) {
			
			if(n%i == 0) {
				
				System.out.println(isPrime = false);
				
			}
			
		} 
		
		if(isPrime) {
			
			System.out.println("no is prime");
			
		}
		
		else {
			
			System.out.println("no is not prime");
		}
	}
}
 