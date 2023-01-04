import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class deque {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String cmnds = br.readLine();
		
		Teque teque = new Teque();
		
		for(int i = 0; i < Integer.parseInt(cmnds); i++) {
			
			String cmnd = br.readLine();
			
			if(cmnd.contains("get")) {
				int num = Integer.parseInt(cmnd.substring(4, cmnd.length()));
				teque.get(num);

			} else if(cmnd.contains("push_front")) {
				
				int num = Integer.parseInt(cmnd.substring(11, cmnd.length()));
				teque.pushFront(num);
				System.out.println(teque.front.next);
				
			} else if(cmnd.contains("push_middle")) {
				
				int num = Integer.parseInt(cmnd.substring(11, cmnd.length()));

			} else if(cmnd.contains("push_back")) {
				
				int num = Integer.parseInt(cmnd.substring(9, cmnd.length()));

			}
			
		}
		
		teque.print();
	}
	
	
	
}
