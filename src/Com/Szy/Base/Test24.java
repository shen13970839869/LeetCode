package Com.Szy.Base;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {4,2,0,3,2,5};
		String s = "13870608158";
		System.out.println(s.matches("1(38|39)\\d{8}"));;
//		trap(i);
	}
	/*
	 * 定义俩个下标
	 * 
	 * 遇到比自己小的数字就记录 与范围内最大数字判断进行替换
	 * 一旦遇到比自己大的数字就结束循环，开始算水量 然后下标跟过去
	 * 
	 * */
	public static int trap(int[] height) {
		int l =0,r=0,count=0;
		while(l<height.length) {
			r=l+1;
			int i=l+1;
			for(;i<height.length;i++) {
				if(height[l]<=height[i]) {
					r=i;
					break;
				}else {
					r=height[r]>=height[i]?r:i;
				}
			}
//			System.out.println(l+" "+r);
			for(int j=l+1;j<r;j++) {
				int min = Math.min(height[l], height[r]);
				count+=(min-height[j]);
			}
//			System.out.println(count);
			l=r;
		}
//		System.out.println(count);
		return count;
    }
}
