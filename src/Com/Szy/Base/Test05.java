package Com.Szy.Base;

public class Test05 {
	public static void main(String[] args) {
		int[] i = {0,1,1,0};
		int[] j = {1,100,1,1,1,100,1,1,100,1};
		int[] k = {0,0,1,2};
		int[] m = {0,1,2,1};
		System.out.println(minCostClimbingStairs(j));;
	}
	public static int minCostClimbingStairs(int[] cost) {
		int n = cost.length;
		int[] dp = new int[n+1];
		dp[0]=0;dp[1]=0;
		for(int i=2;i<=n;i++) {
			dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
		}
		return dp[n];
//		int i=0;
//		int costs = 0;
//		while(true) {
//			System.out.println(i+"  "+costs);
//			if(i==0&&costs==0) {
//				if(cost[i]==cost[i+1]) {
//					costs+=cost[i];
//					i=i+1;
//				}else if((i+2)<cost.length&&cost[i]+cost[i+2]<=cost[i+1]) {
//					costs+=cost[i];
//					i=i+2;
//				}else {
//					i=i+1;
//				}
//				continue;
//			}
//			if(cost.length==2) {
//				return cost[0]>cost[1]?cost[1]:cost[0];
//			}
//			if(i>=cost.length-2) {
//				return costs+cost[i];
//			}
////			if(i==cost.length-2) {
////				return costs;
////			}
//			if(cost[i+1]==cost[i+2]) {
//				costs+=cost[i];
//				i=i+2;
//			}else if((i+2)<cost.length&&cost[i]+cost[i+2]<=cost[i+1]) {
//				costs+=cost[i];
//				i=i+2;
//			}else {
//				costs+=cost[i];
//				i=i+1;
//			}
//		}
	}
}
