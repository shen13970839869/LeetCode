package Com.Szy.Base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dvdf";
		lengthOfLongestSubstring(s);
	}
	public static int lengthOfLongestSubstring(String s) {
		Set map = new HashSet();
//		int l=0,r=0;
		int max=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println(c);
			if(!map.contains(c)) {
				map.add(c);
			}else {
				max = Math.max(max, map.size());
				i=i-map.size();
				map.clear();
//				System.out.println(i);
			}
		}
		max = Math.max(max, map.size());
//		System.out.println(max);
		return max;
    }
}
