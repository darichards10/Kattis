import java.util.*;

public class jackolantern {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num = 1;
        for(int i = 0; i < 3; i++) {
         
         num *= in.nextInt();
         
            
        }
        
        System.out.println(num);
    }
}