
public class PalinDromeNumbers {
	
	public static boolean isPalinDrome(int num) {
		int revnum =0;
		
		int temp = num;
		
		while(temp>0) {
			revnum = (revnum*10)+temp%10;
			temp = temp/10;
		}
		System.out.println(revnum);
		if(revnum==num)
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println("is 12831 a palindrom:" + (isPalinDrome(12831)?"Yes":"No"));
	}

}
