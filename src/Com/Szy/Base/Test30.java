package Com.Szy.Base;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int[] maxSlidingWindow(int[] nums, int k) {
		 int max=Integer.MIN_VALUE;
		 for(int i=0;i<k;i++) {
			 max = Math.max(max, nums[i]);
		 }
		 int[] num = new int[nums.length-k+1];
		 for(int i=1;i<nums.length-k;i++) {
			 if(nums[i-1]==max) {
				 max=Integer.MIN_VALUE;
				 for(int j=i;j<k;j++) {
					 max = Math.max(max, nums[j]);
				 }
			 }else {
				 max = Math.max(max, nums[i+k-1]);
			 }
			 num[i]=max;
		 }
		 return num;
	 }
}
