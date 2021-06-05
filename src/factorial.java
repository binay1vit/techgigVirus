
public class factorial {
	
	// factorial using recursive method
	// A recursive function which call itself
	
	public static long fact(int num) {
		if(num==0)
			return 1;
		else
			return(num*fact(num-1));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Factorial of 3 is : "+ fact(15));
	}

}
