package Com.Szy.Base;

public class Test04 {
	public static void main(String[] args) {
		System.out.println(climbStairs(25));;
	}
	public static int climbStairs(int n) {
		//https://leetcode.cn/problems/n-th-tribonacci-number/?envType=study-plan-v2&envId=dynamic-programming
//		if(n==0) {
//			return 1;
//		}else if(n<=2) {
//			return climbStairs(n-1);
//		}else {
//			return climbStairs(n-1)+climbStairs(n-2);
//		}
		if(n<2)return n;
		int j=0,k=0,l=1,r=1;
		for(int i=2;i<n;i++) {
			j=k;
			k=l;
			l=r;
			r=j+k+l;
		}
		return r;
    }
}

