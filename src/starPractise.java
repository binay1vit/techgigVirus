
public class starPractise {

	public static void main(String[] args) {
		increasingRighttriangle(5);
		//decreasingtriangle(5);
	}
	
	public static void increasingtriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void decreasingtriangle(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void increasingRighttriangle(int n) {
		int count=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>count)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			count--;
			System.out.println();
		}
	}
	
	//pyramid
	//   *
	//  * *
	
	

}
