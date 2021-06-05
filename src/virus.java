import java.util.ArrayList;
import java.util.Scanner;

public class virus {

	public static void main(String[] args) {
		
		      System.out.println("Enter Virus code:");
		      Scanner sc = new Scanner(System.in);
		      String virus = sc.nextLine();
		      System.out.println("Enter no of sample:");
		      int sample = Integer.parseInt(sc.nextLine());

		      ArrayList<String> bloods = new ArrayList<String>();
		      System.out.println("Enter Blood codes for all samples:");
		      for(int i=0;i<sample;i++){
		         String blood = sc.nextLine();
		         bloods.add(blood);
		      }
		      for(int count=0;count<sample;count++){
		         boolean pos=false;
		         String blood = bloods.get(count);
		         System.out.println(blood);
		         String varVirus=virus;
		         for(int i=0;i<blood.length();i++){
		            if (varVirus.contains(String.valueOf(blood.charAt(i)))) {
		            	int begIndex=varVirus.indexOf(blood.charAt(i), 0);
		            	varVirus=varVirus.substring(begIndex);
		               pos=true;
		            }
		            else {
		               pos=false;break;}
		         }
		         if(pos)
		            System.out.println("POSITIVE");
		         else
		            System.out.println("NEGATIVE");
		         
		         pos=false;
		      }
		      
	

	}

}
