import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTaskscheduler {

	public static void main(String[] args) throws IOException, InterruptedException {
		// schtasks /run /tn "HowToTask"
		 
		//schtasks /Run [/S system [/U username [/P [password]]]]  /TN taskname
		
				

		  List<String> commands = new ArrayList<String>();

		  commands.add("schtasks.exe");
		  commands.add("/run");
		  commands.add("/tn");
		  commands.add("test");

		  ProcessBuilder builder = new ProcessBuilder(commands);
		  Process p = builder.start();
		  p.waitFor();
		  System.out.println(p.exitValue()); // 0 : OK
		                                     // 1 : Error

	}

}
