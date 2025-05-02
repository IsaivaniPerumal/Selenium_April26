package week1.day2.homework;

public class Palindrome {

	static int input = 123;
	static int output = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=121;i!=0;i/=10) {
			
			int rem = i%10;
			System.out.println(rem);
			output = (output*10)+rem;
			System.out.println(output);
			
		}

	if(input == output) {
		System.out.println("input is a palindrome");
	}
	else {
		System.out.println("input is not a palindrome");
	}
	
	}

}
