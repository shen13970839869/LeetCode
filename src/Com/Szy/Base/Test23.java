package Com.Szy.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test23 {
	public static void main(String[] args) {
		int[] i = {3,0,-2,-1,1,2};
		threeSum(i);
	}
	/*
	 * 先sort一下
	 * 定义3个指针 1个指针再最右边
	 * 一个指针指向第二个元素
	 * 还一个一直在0 之后向左移动
	 * 循环n-1-i
	 * 一直动中间指针
	 * 一次循环结束后将右边指针向左移动 直到等于1结束
	 * 将记录到的元素放在list中存到list中
	 * 在声明个set集合 每次将排序后的list集合放入
	 * 以去重
	 * */
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int l=0,r=nums.length-1,m=l+1;
		while(1==1) {
			m=l+1;r=nums.length-1;
			if(nums[l]>0)break;
			if(l > 0 && nums[l] == nums[l-1]) {continue;} 
			if(nums[l]+nums[r]+nums[m]==0) {
				List<Integer> li = new ArrayList<Integer>();
				li.add(nums[l]);li.add(nums[r]);li.add(nums[m]);
				list.add(li);
				while((m)<r&&nums[m]==nums[m+1]) {
					m++;
				}
				while(m<(r)&&nums[r]==nums[r-1]) {
					r--;
				}
				m++;
				r--;
			}else if(nums[l]+nums[r]+nums[m]<0) {
				m++;
			}else {
				r--;
			}
			System.out.println(l+" "+m+" "+r);
		}
		System.out.println(list.size());
		return list;
    }
}
