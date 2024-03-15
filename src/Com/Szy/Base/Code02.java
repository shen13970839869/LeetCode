package Com.Szy.Base;

import java.util.Arrays;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[][] merge(int[][] intervals) {
		int count=0;
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i-1][1]>=intervals[i][0]) {
				intervals[i][0]=intervals[i-1][0];
				intervals[i-1][1]=-1;
				count++;
			}
		}
		Arrays.sort(intervals);
		int[][] num = new int[intervals.length-count][2];
		count=0;
		for(int i=0;i<intervals.length;i++) {
			if(intervals[i][1]!=-1) {
				num[count][0]=intervals[i][0];
				num[count++][1]=intervals[i][1];
			}
		}
		return num;
    }
}
