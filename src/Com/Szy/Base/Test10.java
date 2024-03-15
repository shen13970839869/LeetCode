package Com.Szy.Base;

public class Test10 {
	public static void main(String[] args) {
		int[][] i = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int[][] j = {{1}};
		System.out.println(islandPerimeter(i));
	}
	/*
	 * 还是想多了
	 * 没有分析出来正确的思路
	 * 这么看确实是简单题
	 * 想多了，不需要dfs的
	 * */
	static int[] d = {0,1,0,-1,0};
	public static int islandPerimeter(int[][] grid) {
		int round = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1) {
					for(int k=0;k<4;k++) {
						int tx = i+d[k];
						int ty = j+d[k+1];
						if(tx<0||tx>=grid.length||ty<0||ty>=grid[0].length||grid[tx][ty]==0) {
							round++;
						}
					}
					
				}
			}
		}
		return round;
//		int round = 0;
//		for(int i=0;i<grid.length;i++) {
//			for(int j=0;j<grid[0].length;j++) {
//				if(grid[i][j]==1) {
//					round += dfs(grid,i,j);
//				}
//			}
//		}
//		return round;
    }
	public static int dfs(int[][] grid,int x,int y) {
		if(!valid(grid,x,y)) {
			return 1;
		}
		if(grid[x][y]==1){
			grid[x][y]=2;//标记已访问
			int res=0;
			for(int k=0;k<4;k++) {
//				System.out.println("1res="+res+" x="+x+" y="+y+" k="+k);
				x+=d[k];y+=d[k+1];
//				System.out.println("2res="+res+" x="+x+" y="+y+" k="+k);
				res+=dfs(grid,x,y);
				x-=d[k];y-=d[k+1];
			}
			return res;
		}else if(grid[x][y]==0) {
			return 1;
		}else {
			return 0;
		}
	}
	public static boolean valid(int[][] grid,int x,int y) {
		return x>=0&&x<grid.length&&
				y>=0&&y<grid[0].length ;
	}
}
