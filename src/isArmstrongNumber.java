
public class isArmstrongNumber {
	
	public static boolean isArmstrongNumber(int num) {
		int sum=0;
		int t=num;
		while(t>0) {
			sum = (int) (sum + Math.pow(t%10, 3));
			t=t/10;
		}
		if(sum==num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("is 155 an armsstrong:"+(isArmstrongNumber(155)?"Yes":"No"));

	}

}
