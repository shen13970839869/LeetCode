package Com.Szy.Base;

public class Test06 {
	public static void main(String[] args) {
		
	}
	//迪杰斯特拉算法练习
	public static void djstl(int n, int[][] roads) {
		int[] vis = new int[n];
		int[] dist = new int[n];
		for(int i=0;i<n;i++) {
			dist[i] =roads[0][i];
		}
		for(int i=1;i<n;i++) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			
			for(int j=1;j<n;j++) {
				if(roads[0][j]<min) {
					min=roads[0][j];
					index=j;
				}
			}
			vis[index]=1;
			for(int j=1;j<n;j++) {
				if(roads[index][j]<Integer.MAX_VALUE&&roads[index][j]+dist[index]<dist[j]) {
					dist[j]=roads[index][j]+dist[index];
				}
			}
		}
		
	}
}
