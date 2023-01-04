import java.awt.Point;
import java.util.Scanner;

public class kindsofpeople {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int r = in.nextInt();
		int c = in.nextInt();
		String blank = in.nextLine();
		
		String[][] map = new String[c][r];
		
		for(int y = 0; y < r; y++) {
			//each row
			
			String row = in.nextLine();
			
			String[] coord = row.split("");
			
			for(int x = 0; x < c; x++) {
				map[x][y] = coord[x];
			}
		}
		
		int pairRows = in.nextInt();
		blank = in.nextLine();
		
		for(int i = 0; i < pairRows; i++) {
			
			String points = in.nextLine();
			
			String[] pairs = points.split(" ");
			
			int startY = Integer.parseInt(pairs[0]) - 1;
			int startX = Integer.parseInt(pairs[1]) - 1;
			
			int endY = Integer.parseInt(pairs[2]) - 1;
			int endX = Integer.parseInt(pairs[3]) - 1;
			
			
			Point start = new Point(startX, startY);
			Point end = new Point(endX, endY);
			
			//map[x-1][y-1] 
			//printMap(map);
			
			String[][] tempMap = map;
			
			search(map, start, end);
			
			map = tempMap;
		}	
	}
	
	public static void search(String[][] map, Point curPoint, Point end) {
		//row = y = map[][y]
		//column = x = map[x][]
		
		//Point = (row, col) = (y, x)
		//Map = [x][y]
		System.out.println(curPoint.toString());
		//cover every possible path and check if currentPoint is ever end point
		map[curPoint.x][curPoint.y] = "X";
		if(curPoint.equals(end)) {
			//base case - point found and path solved
			if(map[end.x][end.y].equals("1")) {
				System.out.println("decimal");
			} else {
				System.out.println("binary");
			}
			
		} else if(curPoint.x < map.length - 1 && map[curPoint.x + 1][curPoint.y].equals(map[end.x][end.y])){
			//move right

			 search(map, new Point(curPoint.x + 1, curPoint.y), end);
			 
		} else if (curPoint.y < map[0].length && map[curPoint.x][curPoint.y + 1].equals(map[end.x][end.y])) {
			//move down
			 search(map, new Point(curPoint.x, curPoint.y + 1), end);
			 
		}  else if (curPoint.x > 0 && map[curPoint.x - 1][curPoint.y].equals(map[end.x][end.y])) {
			//move left
			 search(map, new Point(curPoint.x - 1, curPoint.y), end);
			 
		}  else if (curPoint.y > 0 && map[curPoint.x][curPoint.y - 1].equals(map[end.x][end.y])) {
			//move up
			 search(map, new Point(curPoint.x, curPoint.y - 1), end);
			 
		} else {
			//backtrack
			System.out.println("Deadend");
			return;
		}
	}
	
	
	public static void printMap(String[][] map) {
		
		for(int y = 0; y < map[0].length; y++) {
			
			for(int x = 0; x < map.length; x++) {
				System.out.print(map[x][y]);
			}
			System.out.println("row-"+y);
		}
		System.out.println("-----------------");
	}
	
}


