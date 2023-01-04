import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class quickscope {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<>();
		
		String cmnds = br.readLine();
		
		
		for(int i = 0; i < Integer.parseInt(cmnds); i++) {
			String cmnd = br.readLine();
			String[] parts = cmnd.split(" ");
			
			if(cmnd.contains("TYPEOF")) {
				
				if(map.containsKey(parts[1])){
					System.out.println(map.get(parts[1]));
				} else {
					System.out.println("UNDECLARED");
				}
				
				
			} else if (cmnd.contains("DECLARE")) {
				if(map.containsKey(parts[1])) {
					map.put(parts[1], "MULTIPLE DECLARATIONS");
				} else {
					map.put(parts[1], parts[2]);
				}
			}
			
		}
		
	}
}
