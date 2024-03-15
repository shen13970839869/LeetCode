package Com.Szy.Base;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test11 {
	public static void main(String[] args) {
		System.out.println(minimumPossibleSum(1000000000,1000000000));
	}
	/*
	 * 思路还是没有跟上题解的
	 * 没有用数学思维去考虑问题
	 * 这个方法不能适用于数字较大题目，否则会超时
	 * 以后还是要多思考背后的数学思维
	 * */
	public static int minimumPossibleSum(int n, int target) {
		long res  = 0;
		int mod = (int)1e9+7;
		if(n<(target/2)) {
			res= n*(n+1)/2;
//			System.out.println();
		}else {
			int m =target/2;
			System.out.println((long)m*(m+1)/2);
			System.out.println(((long)target+n-m)*(target+n-m-1)/2);
			System.out.println(((long)target+1)*target/2);
			res += (long)m*(m+1)/2%mod;
			res += (((long)target+n-m-1)*(target+n-m)/2)%mod;
			System.out.println(res);
			res -=(((long)target-1)*target/2)%mod;//多余了，增加计算量
		}
		return (int)res%mod;
//		int res = 0;
//		int mod = (int) (1e9+7);
//		List<Integer> set = new LinkedList<Integer>();
//		set.add(0);
//		for(int i=0;i<n;i++) {
//			for(int j=set.get(i)+1;;j++) {
////				System.out.println(j+" "+(!set.contains(j))+" "+(!set.contains(target-j)));
//				if(!set.contains(j)&&!set.contains(target-j)||target==j) {
////					System.out.println(res+" "+j+" "+(!set.contains(target-j)));
//					set.add(j);
//					res+=j;
//					res%=mod;
//					break;
//				}
//			}
//		}
//		return res;
    }
}
