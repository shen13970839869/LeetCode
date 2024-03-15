package Com.Szy.Base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test14 {
	public static void main(String[] args) {
		int[][] x = {{1, 1}, {0, 1}};
		System.out.println(largestIsland(x));
	}
	static int[] d = {0,1,0,-1,0};
	public static int largestIsland(int[][] grid) {
		int index=0;
		int n =grid.length;
		int max=0;
		int[] area = new int[n*n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==1) {
					index++;
					int res = dfs(grid, i, j, index);
					max = Math.max(max, res);
					area[index]=res;
				}
			}
		}
//		System.out.println(area[1]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==0) {
					Set<Integer> map = new HashSet<Integer>();
					int count =1;
					for(int k=0;k<4;k++) {
						int x=i+d[k],y=j+d[k+1];
						if(!valid(grid,x ,y)||grid[x][y]<2||map.contains(grid[x][y])) {
							continue;
						}
//						System.out.println(grid[x][y]-1);
						count+=area[grid[x][y]-1];
						map.add(grid[x][y]);
					}
					max = Math.max(max, count);
				}
			}
		}
		return max;
	}
	public static int dfs(int[][] grid,int x,int y,int index) {
		if(!valid(grid,x,y)) {
			return 0;
		}
		if(grid[x][y]!=1) {
			return 0;
		}
		int res=0;
		grid[x][y]=1+index;
		res=0;
		for(int i=0;i<4;i++) {
			
			res+=dfs(grid,x+d[i],y+d[i+1],index);
			
//			System.out.println(res+" "+x+" "+y);
		}
		return 1+res;
	}
	public static boolean valid(int[][] grid,int x,int y) {
		return x>=0&&x<grid.length&&y>=0&&y<grid.length;
	}
}
