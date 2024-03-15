package Com.Szy.Base;

import java.util.Arrays;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,2,1}; int k = 3;
		subarraySum(nums,k);
	}
	/*
	 * 首先计算出数组的前缀和
	 * 然后for循环遍历每个浅醉和与k比较
	 * 如果大于k则从0向当前位置减
	 * 如果小于k直接结束循环
	 * 如果等于k则++ 结束循环
	 * 
	 * */
	public static int subarraySum(int[] nums, int k) {
		int[] sum = new int[nums.length];
		Arrays.sort(nums);
		sum[0]=nums[0];
		for(int i=1;i<nums.length;i++) {
			sum[i]=nums[i]+sum[i-1];
		}
		int count=0;
		for(int i=0;i<nums.length;i++) {
			System.out.println(count);
			if(sum[i]<k)continue;
			if(sum[i]==k) {
				count++;
				continue;
			}
			if(sum[i]>k) {
				for(int j=0;j<i;j++) {
					sum[i]-=nums[j];
					if(sum[i]<k)break;
					if(sum[i]==k) {
						count++;
						break;
					}
				}
			}
		}
		return count;
    }
}
