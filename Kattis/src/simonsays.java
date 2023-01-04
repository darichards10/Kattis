import java.util.Scanner;
public class simonsays {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int statements = in.nextInt();
        String blank = in.nextLine();
        
        for(int i = 0 ; i < statements; i++) {
            String said = in.nextLine();
            if(said.contains("Simon says")) {
                System.out.println(said.substring(11, said.length()-1));
            }
        }
        
    }
}