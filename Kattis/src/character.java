import java.util.Scanner;

public class character {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int characters = in.nextInt();
		int relationships = 0;
		if(characters <= 1) {
			System.out.println("0");
		} else {
			
			for(int i = 1, x = 1, y = 1; i < characters; i++, x += y * 2, y*=2) {
				relationships += x;
			}
			System.out.println(relationships);
		}
		
	}
}
