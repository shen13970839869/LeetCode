package Com.Szy.Base;

import java.util.Arrays;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-530219056,353285209,493533664};
		System.out.println(kSum(nums,6));
//		[846818873, 493533664, 353285209, 316599817, 
//		 -36685392, -176933847, -530219056]
	}
	static int cnt;

    public static long kSum(int[] nums, int k) {
        int n = nums.length;
        long total = 0, total2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                total += nums[i];
            } else {
                nums[i] = -nums[i];
            }
            total2 += Math.abs(nums[i]);
            System.out.println(total+"  "+total2);
        }
        Arrays.sort(nums);
        long left = 0, right = total2;
        while (left <= right) {
            long mid = (left + right) / 2;
            cnt = 0;
            dfs(nums, k, n, 0, 0, mid);
            if (cnt >= k - 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return total - left;
    }

    public static void dfs(int[] nums, int k, int n, int i, long t, long limit) {
        if (i == n || cnt >= k - 1 || t + nums[i] > limit) {
            return;
        }
        cnt++;
        dfs(nums, k, n, i + 1, t + nums[i], limit);
        dfs(nums, k, n, i + 1, t, limit);
    }
//
//作者：力扣官方题解
//链接：https://leetcode.cn/problems/find-the-k-sum-of-an-array/solutions/2668280/zhao-chu-shu-zu-de-di-k-da-he-by-leetcod-z5kq/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
