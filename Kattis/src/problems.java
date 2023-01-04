import java.util.Scanner;

public class problems {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		if(num < 149) {
			System.out.println(99);
		} else {
			int min = -1;
			int max = 99;
			
			while(num > max) {
				min += 100;
				max += 100;
			}
			
			
			int differenceMin = num - min;
			int differenceMax = max - num;
			
			if(differenceMin < differenceMax) {
				System.out.println(min);
			} else {
				System.out.println(max);
			}
			
		}
	}
}
