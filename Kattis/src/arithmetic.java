import java.util.*;

public class arithmetic {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String octalNum = in.nextLine();
		
		String hexNum = Integer.toString(
				Integer.parseInt(octalNum, 8), 16);
		
		System.out.println(hexNum);
	
	}
}
