package Com.Szy.Base;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7}; int k = 3;
		rotate(nums,k);
	}
	public static void rotate(int[] nums, int k) {
		k=k%nums.length;
		int[] num = new int[nums.length];
		int count=0;
		for(int i=nums.length-k;i<nums.length+k+1;i++) {
			num[count++]=nums[i%nums.length];
//			System.out.println(num[count-1]);
		}
    }
}
