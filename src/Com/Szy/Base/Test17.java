package Com.Szy.Base;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob(new int[] {4,1,2,7,5,3,1}));
	}
	/**
	 * 如果不偷这个房子，那么问题就变成在前 k−1k-1k−1 个房子中偷到最大的金额，
	 * 也就是子问题 f(k−1)f(k-1)f(k−1)。如果偷这个房子，那么前一个房子 Hk−2H_{k-2}H 
k−2
​
		  显然不能偷，其他房子不受影响。
		  那么问题就变成在前 k−2k-2k−2 个房子中偷到的最大的金额。
		  两种情况中，选择金额较大的一种结果。

	 * @param nums
	 * @return
	 */
	public static  int rob(int[] nums) {
		int[] dp = new int[nums.length+1];
		int max=0;
		dp[0]=0;dp[1]=nums[0];
		for(int i=2;i<=nums.length;i++) {
			dp[i] = Math.max(dp[i-2]+nums[i-1], dp[i-1]);
		}
		return dp[nums.length];
//		int max=0;
//		int[] d = new int[nums.length];
//        if(nums.length<2) {
//			return nums[0];
//		}
//		d[0]=nums[0];d[1]=nums[1];
//		max = Math.max(d[0],d[1]);
////		for(int i=2;i<nums.length;i++) {
////			d[i] = Math.max(d[i-1], nums[i]+d[i-2]);
////			max = Math.max(max, d[i]);
//////			System.out.println(d[i]);
////		}
//		for(int i=3;i<nums.length;i++) {
//			d[i] = Math.max(Math.max(Math.max(d[i-1], nums[i]+d[i-3]),Math.max(d[i-2], nums[i]+d[i-3])),Math.max(d[i-1], nums[i]+d[i-2]));
//			max = Math.max(max, d[i]);
//		}
//		return max;
    }
}
