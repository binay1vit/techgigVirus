
public class PrimeNumbers {
	
	public static boolean isPrime(int num) {
		
		if(num<2)
			return false;
		
			for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
			}
			return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		System.out.println("is 19 prime number :" + (isPrime(2)?"Yes":"No"));
		System.out.println("is 17 prime number :" + (isPrime(3)?"Yes":"No"));
		System.out.println("is 4 prime number :" + (isPrime(4)?"Yes":"No"));
		System.out.println("is 0 prime number :" + (isPrime(4)?"Yes":"No")); */
		
		// find how many prime numbers are there between 1 to 20
		
		int x=5;
		int[][] arr = new int[2][x];
		
		int countPrime = 0;
		System.out.println("Prime numbers :");
		for(int i=1;i<=20;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				countPrime ++;
			}
				
		}
		System.out.println("Total count:"+countPrime);

	}

}