package Com.Szy.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2};
		maxArrayValue(n);
	}
	/*
	 * 先将数组list化
	 * 从后往前遍历
	 * 如果num[i+1]>=num[i] 且num[i+1]+num[i]>num[i-2]
	 * 那就合起来，否则跳过
	 * 如果num[i-2]不存在则直接合
	 * 
	 * */
	public static long maxArrayValue(int[] nums) {
		List<Integer> arr = new LinkedList();
		for(int i:nums) {
			arr.add(i);
		}
		long res=0;
		for(int i=0;i<nums.length-1-i;i++) {
			
		}
		return 0;
    }
	/*
	 * 0,0->2,0->2,2->2,0->1,0->1,1
	 * 
	 * */
	public static List<Integer> spiralOrder(int[][] matrix) {
//		List<Integer> arr = new ArrayList<Integer>();
//		int m=matrix.length,n=matrix[0].length;
//		int x=0,y=0;
//		for(int i=0;i<m+n;i++) {
//			arr.add(matrix[][])
//		}
    }
}
