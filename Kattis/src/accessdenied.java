import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class accessdenied {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		boolean test = false;
		
		while(!test) {
			
			String password = "";
			
			Random ran = new Random();
			
			for(int i = 0; i < ran.nextInt(20)+1; i++) {
				//random size
				
				int asciiVal = ran.nextInt(26);
				
				password += (char) ('A' + asciiVal);
				
			}
			
			System.out.println(password);
			
			String response = br.readLine();
			
			if(response.contains("ACCESS GRANTED")) {
				test = true;
			}
		}
		
	}
}
