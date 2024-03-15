package Com.Szy.Base;

import java.math.BigInteger;

public class Test07 {
	public static void main(String[] args) {
		String i = "1010";
		int[] m = divisibilityArray(i,10);
		for(int j:m)
			System.out.println(j);;
//		System.out.println((0*10+'1'));
//		System.out.println(Integer.MAX_VALUE);
	}
	public static int[] divisibilityArray(String word, int m) {
		int n = word.length();
		int[] div = new int[n];
		long res = 0;
		for(int i=0;i<n;++i) {
			char c = word.charAt(i);
//			System.out.println(c+"  "+res);
			res = (res*10+c-'0')%m;
//			System.out.println(res);
			if(res==0)div[i]=1;
		}
		return div;
		//		int n = word.length();
//		int[] div = new int[n];
//		for(int i=0;i<n;i++) {
//			BigInteger son = BigInteger.valueOf(Long.parseLong(word.substring(0,i+1)));
//			System.out.println(son+"son");
//			BigInteger x = BigInteger.valueOf(Long.parseLong(m+""));
//			if(son.mod(x).compareTo(new BigInteger("0"))==0)div[i]=1;
////			System.out.println(son.mod(x)+"  s");
//		}
//		return div;
    }
}
