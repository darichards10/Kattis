import java.util.*;

public class oddecho {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strings = in.nextInt();
        String blank= in.nextLine();
        
        for(int i = 1; i <= strings; i++) {
            
            String str = in.nextLine();
            
            if(i % 2 == 1) {
                System.out.println(str);
            }
        }
        
    }
    
    
}