
public class countOccurence {

	public static void main(String[] args) {
		/*
		 * String given = "1112222111"; int count = 0; for(int i=0;i<given.length();i++)
		 * { if(given.charAt(i)=='1') count++; }
		 * System.out.println("1 repates count :"+count);
		 */
		
		String str = "I love India, I love jharkhan,I love jamshedpur";
		String[] arr = str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("love"))
				count ++;
		}
		System.out.println(count);
	}

}
