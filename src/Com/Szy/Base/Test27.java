package Com.Szy.Base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int distinctAverages(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length/2;i++) {
			set.add(nums[i]+nums[nums.length-1-i]);
		}
		return set.size();
    }
}
