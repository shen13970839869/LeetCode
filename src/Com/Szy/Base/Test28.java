package Com.Szy.Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		findAnagrams(s,p);
	}
	/*
	 * 对于每个子字符串都排序一下
	 * p也排序
	 * */
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		int[] pp = new int[26];
		for(int i=0;i<p.length();i++) {
			pp[p.charAt(i)-'a'] = 1;
		}
		for()
		return list;
    }
}
