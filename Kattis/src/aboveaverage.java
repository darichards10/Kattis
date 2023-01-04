import java.util.Scanner;

public class aboveaverage {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		
		for(int i = 0; i < cases; i++) {
			
			String blank = in.nextLine();
			
			int tests = in.nextInt();
			int[] scores = new int[tests];
			
			int sum = 0;
			
			for(int x = 0; x < tests; x++) {
				int grade = in.nextInt();
				
				sum += grade;
				scores[x] = grade;
			}
			
			double avg = sum / tests;
			
			double numOfStudents = 0.0;
			
			for(int y = 0; y < tests; y++) {
				if(scores[y] > avg) numOfStudents++;
			}
			
			
			double percent = (numOfStudents / tests) * 100;
			
			System.out.printf("%.3f", percent);
			System.out.println("%");
			
		}
		
	}
}
