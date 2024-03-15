package Com.Szy.Base;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHint("1807","7810"));
	}
	/*
	 * 首先遍历整个长度
	 * 对每个位置数字进行比对
	 * 若相等则公牛+1
	 * 若不相等则分别加入int数组 （长度为10） 相同数字个数+1
	 * 最后便利2个int数组 
	 * 若数字个数相同则加上所有
	 * 若秘密数字个数大于猜的数字则将猜的数字个数加上
	 * 若猜的数字个数大于秘密个数 则将秘密数字个数都加上
	 * 最后返回
	 * */
	public static String getHint(String secret, String guess) {
		int[] x = new int[10];
		int[] y = new int[10];
		int bull = 0;
		int cow = 0;
		for(int i=0;i<secret.length();i++) {
			int num1 = secret.charAt(i)-'0';
			int num2 = guess.charAt(i)-'0';
			if(num1==num2) {
				bull++;
			}else {
				x[num1]++;
				y[num2]++;
			}
		}
		for(int i=0;i<10;i++) {
			if(x[i]<=y[i]) {
				cow+=x[i];
			}else {
				cow+=y[i];
			}
		}
		return bull+"A"+cow+"B";
    }
}
