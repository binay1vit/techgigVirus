import java.util.ArrayList;
import java.util.HashMap;

public class stringPractise {

	public static void main(String[] args) {
		String str = "you and we love India and Jamshedpur and Jharkhand";
		
		//System.out.println(alphabeticOrder(str));
		
		//countOccurenceOfWord(str);
		
		countOccurenceOfLetter(str);
		
	}
	
	public static String reverse(String str) {   //reverse string
		StringBuffer returnStr= new StringBuffer("");
		
		
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ')
				returnStr=returnStr.append(str.charAt(i));
			
			
		}
		return returnStr.toString();
	}
	public static String alphabeticOrder(String str) {  //arrange alphabetic order
		StringBuffer returnStr = new StringBuffer();
		String[] strarr = str.split(" ");
		//HashMap<Integer,String> map = new HashMap<Integer,String>();
		String first="";
		for (int i=0;i<strarr.length;i++) {
			first=strarr[i];
			for (int j=1;j<strarr.length-1;j++) {
				if(strarr[j-1].length()>strarr[j].length()) {
					first=strarr[j-1];
					strarr[j-1]=strarr[j];
					strarr[j]=first;
				}
				else if(strarr[j-1].length()==strarr[j].length()) {
					for (int k=0;k<strarr[j-1].length();k++) {
						if((int)strarr[j-1].charAt(k)>(int)strarr[j].charAt(k)) {
							first=strarr[j-1];
							strarr[j-1]=strarr[j];
							strarr[j]=first;break;
						}
					}
				}
			}
		}
		
		for (int i=0;i<strarr.length;i++) {
			returnStr.append(strarr[i]);
			returnStr.append(" ");
		}
		
		return returnStr.toString();
	}
	
	/*  To count the occurence of each word in string
	 */
	
	public static void countOccurenceOfWord(String str) {
		String strarr[] = str.split(" ");
		int count=0;
		for (int i=0;i<strarr.length;i++) {
			count=0;
			if(!strarr[i].equals(" ")) {
				for(int j=0;j<strarr.length;j++) {
					if(strarr[i].equals(strarr[j])) {
						count++;
						if(i!=j)
							strarr[j]=" ";
					}
				}
				System.out.println("Occurence of word " + strarr[i] + " in given sentence is:"+ count);
			}
		}
	}
	
	public static void countOccurenceOfLetter(String str) {
		char[] ch = str.toCharArray();
		int count=0;
		for (int i=0;i<ch.length;i++) {
			if(!(ch[i]=='-')) {
				count=0;
				for(int j=0;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						if(i!=j)
							ch[j]='-';
					}
				}
				System.out.println("Occurence of " + ch[i] + " in given sentence is: " +count);
			}
		}
	}
	 

}
