import java.util.*;

public class areal {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area = in.nextDouble();
        
        double side = Math.sqrt(area);
        
        System.out.print(side * 4);
    }
    
    
}