package Com.Szy.Base;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,0,1};
		moveZeroes(i);
//		System.out.println(true&&false);
	}
	/*
	 * 定义俩个指针
	 * 第一个指针用于定位目前所在0位置 另一个指针向后寻找非0位置
	 * 找到后将俩边互换
	 * 直到俩指针有之一越界
	 * */
	public static void moveZeroes(int[] nums) {
		int s=0,e=0;
		while(s<nums.length&&e<nums.length) {
			while(s<nums.length) {
				if(nums[s]!=0)s++;
				else break;
			}
			while(e<nums.length) {
				if(nums[e]==0)e++;
				else break;
			}
			System.out.println(s+" "+e);
			if((s<nums.length)&&(e<nums.length)&&s<e) {
				nums[s]=nums[e];
				nums[e]=0;
				
				
				for(int i:nums)
					System.out.print(i+" s ");
				System.out.println();
			}
			e++;
		}
    }
}
