package Com.Szy.Base;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,8,6,2,5,4,8,3,7};
		maxArea(i);
	}
	/*
	 * 定义俩个指针和一个max
	 * 指针分别从头尾开始，每次先记录最大面积，然后再移动最小的指针
	 * 循环结束条件为右针小于等于左
	 * 时间复杂度为O（n）
	 * 空间复杂度为O（1）
	 * */
	public static int maxArea(int[] height) {
		int left=0,right=height.length-1,max=0;
		while(left<right) {
			max = Math.max(max, Math.min(height[left],
					height[right])*(right-left));
			if(height[left]<height[right])left++;
			else right--;
		}
//		System.out.println(max);
		return max;
    }
}
