package Com.Szy.Base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test13 {
	public static void main(String[] args) {
		int[] i = {100,4,200,1,3,2};
		System.out.println(longestConsecutive(i));
	}
	/*
	 * 虽然是过了
	 * 但好像不符合题意
	 * 题目要求O（n）时间完成
	 * 排序时间超过了
	 * */
	public static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:nums) {
			set.add(i);
		}
		int longestStreak=0;
		for(int num:nums) {
			if(!set.contains(num-1)) {
				int currentNum = num;
				int currentStreak = 1;
				while(set.contains(currentNum+1)) {
					currentNum++;
					currentStreak++;
				}
				longestStreak=Math.max(currentStreak, longestStreak);
			}
				
			
		}
		return longestStreak;
//		 Arrays.sort(nums);
//		 for(int i=0;i<nums.length;i++) {
//			 System.out.print(nums[i]+" ");
//			 
//		 }
////		 System.out.println();
//		 if(nums.length==0)return 0;
//		 int count=1;
//		 int max=0;
////		 System.out.println(nums.length);
//		 for(int i=0;i<nums.length-1;i++) {
//			 nums[i] = nums[i+1]-nums[i];
//			 if(nums[i]==1) {
//				 count++;
//			 }else if(nums[i]==0){
//				 
//			 }else {
//				 max = count>max?count:max;
//				 count=1;
//			 }
////			 System.out.println(count+"  "+i);
//		 }
//		 max = count>max?count:max;
//		 return max;
    }
}
