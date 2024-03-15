package Com.Szy.Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {3,1};
		System.out.println(deleteAndEarn(i));;
	}
	/*
	 * [3,4,2]
	 * 假如我删2 我会损失3  但是加入我删3 我会损失6
	 * 所以我选择删除2 损失3
	 * 当我删除4 我不会损失
	 * 所以结果是6
	 * Math.Min(num[i],nums[i+1])
	 * 还是要先排序 从小向大去铺
	 * 需要一个
	 * 
	 * 先数组排序后去重，将数字放在一个新的数组中
	 * 然后循环整个数组
	 * d[0]=0 d[1]=nums[0]
	 * d[2] = Math.max(d[1],d[0]+nums[2])
	 * 
	 * 在偷窃下一个房屋时，如果发现这次的房屋金额如果刚好等于上一次的偷窃金额+1时，
	 * 他就看是偷当前的房屋金额加上前前次的房屋金额大，还是上一次偷窃的房屋金额大。
		dp[i] = max(dp[i-1], dp[i-2] + dp[i] * m[dp[i]]);
		如果这一个房屋的金额比上一次偷窃的金额要比1还大时他知道不会出发报警器，
		因此他就将上次的钱也一起带过来了。
		dp[i] = dp[i-1] + dp[i] * m[dp[i]];
	
	作者：小虎
	链接：https://leetcode.cn/problems/delete-and-earn/solutions/758491/zhe-xiao-tou-you-lai-qiang-jie-liao-ta-z-w29x/
	来源：力扣（LeetCode）
	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
	 * */
	public static int deleteAndEarn(int[] nums) {
		Arrays.sort(nums);
		int count=1;
		int index=1;
		int[] num = new int[nums.length];
		Map<Integer,Integer> map = new HashMap();
		num[0]=nums[0];
		for(int i =1;i<nums.length;i++) {
			if(nums[i]!=num[index-1]) {
				map.put(num[index-1], count);
				count=1;
				num[index++]=nums[i];
			}else {
				count++;
			}
//			System.out.println(num[index]);
		}
		map.put(nums[nums.length-1], count);
		int[] dp = new int[index+1];
		dp[0]=0;dp[1]=num[0]*map.get(num[0]);
		for(int i=2;i<=index;i++) {
//			System.out.println(dp[i-1]+" "+dp[i-2]+" "+(num[i-1]*map.get(num[i-1])));;
			if(num[i-1]==num[i-2]+1)
				dp[i] = Math.max(dp[i-1],dp[i-2]+num[i-1]*map.get(num[i-1]));
			else
				dp[i]=dp[i-1]+num[i-1]*map.get(num[i-1]);
		}
		return dp[index];
    }
}
