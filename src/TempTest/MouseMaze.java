package TempTest;
import static java.lang.System.out;

class Point {
	final int x;
	final int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class MouseMaze {
	public static int[][] go(int[][] maze, Point start, Point end) {
		visit(maze, start, end);
		return maze;
	}

	public static boolean visit(int[][] maze, Point pt, Point end) {
    	if(isVisitable(maze, pt)) {
        	maze[pt.x][pt.y] = 1;
            if(!isEnd(maze, end) && !tryOneOut(maze, pt, end)) {
            	maze[pt.x][pt.y] = 0;
            }
        }
        return isEnd(maze, end);
    }

	public static boolean isVisitable(int[][] maze, Point pt) {
		return maze[pt.x][pt.y] == 0;
	}

	public static boolean isEnd(int[][] maze, Point end) {
		return maze[end.x][end.y] == 1;
	}

	public static boolean tryOneOut(int[][] maze, Point pt, Point end) {
		return visit(maze, new Point(pt.x, pt.y + 1), end) ||
			   visit(maze, new Point(pt.x + 1, pt.y), end) ||
			   visit(maze, new Point(pt.x, pt.y - 1), end) ||
			   visit(maze, new Point(pt.x - 1, pt.y), end);
	}
    
	public static void main(String[] args) {
		int[][] maze = new int[][]{{2, 2, 2, 2, 2, 2, 2}, 
								   {2, 0, 0, 0, 0, 0, 2}, 
								   {2, 0, 2, 0, 2, 0, 2}, 
								   {2, 0, 0, 2, 0, 2, 2}, 
								   {2, 2, 0, 2, 0, 2, 2}, 
								   {2, 0, 0, 0, 0, 0, 2}, 
								   {2, 2, 2, 2, 2, 2, 2}};

	    for(int[] row : MouseMaze.go(maze, new Point(1, 1), new Point(5, 5))) {
	    	for(int block : row) switch(block) {
	    		case 0: out.print("０" + " "); break;
	    		case 1: out.print("１" + " "); break;
	    		case 2: out.print("２" + " ");
	    	}
	    	out.println();
	    }
	    out.println(MouseMaze.isEnd(maze, new Point(5, 5)) 
	    			? "找到出口" : "沒有找到出口！");
	}
} 