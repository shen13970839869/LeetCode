package Com.Szy.Base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test15 {
	public static void main(String[] args) {
		int[] nums = {-487322177,-656480132,850198596,-291605661,-272668395,110865952,-162529283,-145886963,202657909,125667049,-282090943,120877054,-85849348,-482630078,-802177895,-574862206,374637017,804297842};
		System.out.println(kSum(nums,1707));
	}
	public static long kSum(int[] nums, int k) {
		List<Long> list = new ArrayList<Long>();
		long index=0;
		list.add((long)0);
		for(int i:nums) {
			Queue<ArrayList<Long>> queue = new LinkedList<ArrayList<Long>>();
			ArrayList<Long> li = new ArrayList<Long>();
			li.add((long)i);
			li.add(index);
			list.add((long)i);
			queue.offer(li);
			while(!queue.isEmpty()) {
				ArrayList<Long> l = queue.poll();
				long num = l.get(0),ind = l.get(1);
//				System.out.println(num+" index "+ind);
				for(long j=ind+1;j<nums.length;j++) {
					li = new ArrayList<Long>();
					li.add(nums[(int) j]+num);
					li.add(j);
//					System.out.println(li.toString());
					list.add(nums[(int) j]+num);
					queue.offer(li);
				}
			}
			index++;
		}
		list.sort(null);
		System.out.println(list.toString());
		return list.get(list.size()-k+1);
    }
}
