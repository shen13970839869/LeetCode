package Com.Szy.Base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
 * 集合还是不会用，不知道该如何去重，而且判断太过复杂，没有直达内核，虽然有之前的dfs基础
 * 但还是没有做出答案，需要反思
 * 而且在第一个dfs就要去判断max面积
 * 第二个循环不需要dfs，只需要去查看记录数组
 * */
public class Test09 {
	public static void main(String[] args) {
		int[][] i= {{1, 0}, {0, 1}};
		System.out.println(largestIsland(i));
	}
	static int[] d = {0, -1, 0, 1, 0};
	public static int largestIsland(int[][] grid) {
		int n  = grid.length;
		int[] area = new int[n*n];//记录每块面积大小
		int index = 0;//面积下标
		Map<Integer, Integer> are = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==1) {
					dfs(grid,i,j,area,index);
					are.put(index, area[index]);
					max = Math.max(max, are.get(index));
					index++;//面积块加1
				}
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(grid[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==0) {
					int z=1;
					Set<Integer> connected = new HashSet<Integer>();
					for (int k = 0; k < 4; k++) {
						int x = i+d[k],y=j+d[k+1];
						if(!valid(grid, x, y)||(grid[x][y]-2)<0||connected.contains(grid[x][y]-2)) {
							continue;
						}
						z+=are.get(grid[x][y]-2);
						connected.add(grid[x][y]-2);
					}
					max = Math.max(max, z);
				}
			}
		}
		return max;
    }
	public static void dfs(int[][] grid,int x,int y,int[] area,int index) {
		if(!valid(grid, x, y)) {
			return;
		}
		if(grid[x][y]!=1) {
			return;
		}
		area[index]++;
		grid[x][y]=2+index;//2+area[index]  2表明已经访问过了 2+index标记不同块 area[index]用来记录面积大小
		dfs(grid,x+1,y,area,index);
		dfs(grid,x-1,y,area,index);
		dfs(grid,x,y+1,area,index);
		dfs(grid,x,y-1,area,index);
	}
	public static boolean valid(int[][] grid,int x,int y) {
		return x>=0&&x<grid.length&&
				y>=0&&y<grid[0].length;
	}
}
