package Com.Szy.Base;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test08 {
	public static void main(String[] args) {
		char[][] i = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		System.out.println(numIslands(i));;
	}
	public static int numIslands(char[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int max=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
//        		System.out.println(max);
        		if(grid[i][j]==1) {
        			max = Math.max(dfs(i, j, grid), max);
        		}
        	}
        }
        return max;
    }
	public static int dfs(int x,int y,char[][] grid) {
		if(!isArea(grid, x, y))return 0;
		if(grid[x][y]!=1) {
			return 0;
		}
		grid[x][y]=2;
		return 1+dfs(x+1,y,grid)+dfs(x,y+1,grid)+
		dfs(x-1,y,grid)+dfs(x,y-1,grid);
	}
	public static boolean isArea(char[][] grid,int x,int y) {
		return x>=0&&x<grid.length
				&&y>=0&&y<grid[0].length;
	}
}
