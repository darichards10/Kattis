import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class cd {
	
	public static void main(String[] args) throws IOException {
		
		HashSet<String> jacksCollection = new HashSet<>();
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String dim = "";
		try {
			dim = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] sizes = dim.split(" ");
		
		int jacksSize = Integer.parseInt(sizes[0]);
		int jillsSize = Integer.parseInt(sizes[1]);
		
		while(jacksSize > 0 || jillsSize > 0) {
			
			
			int count = 0;
			
			jacksCollection.clear();
			
			
			for(int i = 0; i < jacksSize; i++) {
				String id = reader.readLine();
				jacksCollection.add(id);
			}
			
			for(int i = 0; i < jillsSize; i++) {
				String id = reader.readLine();
				if(jacksCollection.contains(id)) {
					count++;	
				}
			}
			
			System.out.println(count);
			
			
			dim = reader.readLine();
		    sizes = dim.split(" ");
			
		    jacksSize = Integer.parseInt(sizes[0]);
			jillsSize = Integer.parseInt(sizes[1]);
			
		}
	}
	
}
