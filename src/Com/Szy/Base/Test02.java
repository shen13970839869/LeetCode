package Com.Szy.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		int[] i = {3,2,4};
		twoSum(i,6);
	}
	public static int[] twoSum(int[] nums, int target) {
        
        int[] answer = new int[2];
        int len = nums.length;
        for(int i=0;i<len;i++) {
        	for(int j=i+1;j<len;j++) {
//        		System.out.println(nums[i]+nums[j]);
        		if(nums[i]+nums[j]==target) {
        			answer[0]=i;answer[1]=j;
        			break;
        		}
        	}
        	if(answer[1]>0)break;
        }
        
        return answer;
    }
}
