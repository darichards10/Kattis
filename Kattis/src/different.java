import java.math.BigInteger;
import java.util.*;
public class different {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String left = in.next();
			String right = in.next();
			
			BigInteger leftNum = new BigInteger(left);
			BigInteger rightNum = new BigInteger(right);
			BigInteger abs = leftNum.subtract(rightNum).abs();
			System.out.println(abs);
			
		}
	}
}
