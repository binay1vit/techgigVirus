import java.util.Scanner;

public class diffPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      int no = sc.nextInt();
	      int[][] arr = new int[no][2];
	      for(int i=0;i<no;i++){
	         arr[i][0]=sc.nextInt();
	         arr[i][1]=sc.nextInt();
	      }

	      for(int i=0;i<no;i++){
	         int countPrime=0;
	         int smallP = 0;
	         int largeP = 0;
	         for(int j=arr[i][0];j<=arr[i][1];j++){
	            if(isPrime(j)){
	               if(countPrime==0){
	                  smallP=j;
	                  largeP=j;
	                  countPrime++;
	               }
	               else{
	                  largeP=j;
	                  countPrime++;
	               }
	            }
	         }
	         if(countPrime==0)
	            System.out.println("-1");
	         else{
	            int diff = largeP - smallP;
	            System.out.println(diff);
	         }
	         countPrime=0;
	      }
	}

		   public static boolean isPrime(int num){
		      if(num<2)
		         return false;
		      
		      for(int i=2;i<num;i++) {
					if(num%i==0)
						return false;
					}
					return true;
		   }

}
