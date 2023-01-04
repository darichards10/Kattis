import java.math.BigInteger;
import java.util.*;

public class oktalni {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        String binary = in.next();
        
       BigInteger num = new BigInteger(binary,2);
       
        System.out.print(num.toString(8));
        
    }
}