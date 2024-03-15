package Com.Szy.Base;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxSubArray(int[] nums) {
		int max=0,pre=0;
		for(int i=0;i<nums.length;i++) {
			pre = Math.max(pre+nums[i], nums[i]);
			max = Math.max(max, pre);
		}
		return max;
    }
	public static int maxProfit(int[] prices) {
        int max=prices[0],pre=0;
        for(int i=0;i<prices.length;i++) {
        	pre = Math.min(pre, prices[i]);
        	max = Math.max(prices[i]-pre, max);
        }
        return max;
    }
	public static int maxProfit1(int[] prices) {
		int min = prices[0],count=0;
		for(int i=0;i<prices.length;i++) {
			min = Math.min(min, prices[i]);
			if(prices[i]>min) {
				count+=prices[i]-min;
				min = prices[i];
			}
		}
		return count;
    }
	public static int maxProfit2(int[] prices) {
		int[][] dp = new int[prices.length][2];
		
    }
}
