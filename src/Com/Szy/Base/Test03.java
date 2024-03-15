package Com.Szy.Base;

public class Test03 {
	public static void main(String[] args) {
//		System.out.println(8 & 15);
		int[] i = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
//		System.out.println(2^2);
//		System.out.println(Integer.MAX_VALUE);
		findKOr(i,1);
	}
	public static int findKOr(int[] nums, int k) {
		int end =  0;
		int e = 0;
		for(int i =0;i<32;i++) {
			int index = 0;//统计有多少个和为1
			for(int j=0;j<nums.length;j++) {
				int s = (int) Math.pow(2, i);
//				System.out.println(s);
				e = s&nums[j];
				if(s==e) {
					index++;
				}
				if(index>k-1) {
//					System.out.println(end+"end"+s);
					if(end!=2147483647)
						end+=s;
//					System.out.println(end+"v ");
					break;
				}
			}
//			System.out.println(end+"  "+i);
		}
//		System.out.println(end);
        return end;
    }
}
