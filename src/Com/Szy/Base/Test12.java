package Com.Szy.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test12 {
	public static void main(String[] args) {
		String[] i = {"hhhhu","tttti","tttit","hhhuh","hhuhh","tittt"};
		System.out.println(groupAnagrams(i).toString());
	}
	/*
	 * 方向思路还是错了
	 * 还是要多练多想
	 * 想得太复杂了
	 * */
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		for(String str:strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);
			List<String> list = map.getOrDefault(key, new ArrayList<String>());
			list.add(key);
			map.put(key, list);
		}
		return new ArrayList<List<String>>(map.values());
//		List<List<String>> list = new ArrayList<List<String>>();
////		int count = 0;
//		int[] vis = new int[strs.length];
//		for(int i=0;i<strs.length;i++) {
//			Map map = new HashMap();
//			List<String> li = new ArrayList<String>();
//			if(vis[i]!=0)continue;
//			vis[i]=1;
//			li.add(strs[i]);
//			for(int j=0;j<strs[i].length();j++) {
//				char c = strs[i].charAt(j);
//				map.put(c, 1);
//			}
//			System.out.println("map "+map.toString());
//			for(int j=i;j<strs.length;j++) {
//				if(vis[j]!=0)continue;
//				int k=0;
//				if(strs[j]==""&&li.contains(strs[j])) {
//					li.add(strs[j]);
//					vis[j]=1;
//					continue;
//				}
////				System.out.println("li1 "+li.toString());
//				for(k=0;k<strs[j].length();k++) {
//					char c = strs[j].charAt(k);
////					System.out.println("strs["+strs[j]+" c "+c);
////					System.out.println("!map.containsKey(c)"+(!map.containsKey(c)));
//					if(!map.containsKey(c)) {
//						break;
//					}
//				}
//				if(k==strs[j].length()&&li.get(0).length()==k) {
//					li.add(strs[j]);
//					vis[j]=1;
//				}
////				System.out.println("li2 "+li.toString());
//			}
//			list.add(li);
//		}
//		return list;
//		
//		Map<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String str : strs) {
//            int[] counts = new int[26];
//            int length = str.length();
//            for (int i = 0; i < length; i++) {
//                counts[str.charAt(i) - 'a']++;
//            }
//            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < 26; i++) {
//                if (counts[i] != 0) {
//                    sb.append((char) ('a' + i));
//                    sb.append(counts[i]);
//                }
//            }
//            String key = sb.toString();
//            List<String> list = map.getOrDefault(key, new ArrayList<String>());
//            list.add(str);
//            map.put(key, list);
//        }
//        return new ArrayList<List<String>>(map.values());

//作者：力扣官方题解
//链接：https://leetcode.cn/problems/group-anagrams/solutions/520469/zi-mu-yi-wei-ci-fen-zu-by-leetcode-solut-gyoc/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
		
		//		List<List<String>> list = new ArrayList<List<String>>();
//		int[] vis = new int[strs.length];
//		for(int i=0;i<strs.length;i++) {
//			int count = 0;
//			Map map = new HashMap();
//			List<String> li = new ArrayList<String>();
//			if(vis[i]!=0)continue;
//			vis[i]=1;
//			li.add(strs[i]);
//			for(int j=0;j<strs[i].length();j++) {
//				char c = strs[i].charAt(j);
//				map.put(c, 1);
//			}
//			for(int j=i+1;j<strs.length;j++) {
//				if(vis[j]!=0)continue;
//				int k=0;
//				if(strs[j]==""&&li.contains(strs[j])) {
//					li.add(strs[j]);
//					vis[j]=1;
//					continue;
//				}
//				count++;
//				System.out.println("map "+map.toString());
//				System.out.println("count "+count+" j  "+j+" strs[j] "+strs[j]);
//				System.out.println("li1 "+li.toString());
//				for(k=0;k<strs[j].length();k++) {
//					char c = strs[j].charAt(k);
//					System.out.println("!map.containsKey(c)"+(!map.containsKey(c)));
//					System.out.println("(int)map.get(c)!=(count)"+((int)map.get(c)!=(count)));
//					if(!map.containsKey(c)||(int)map.get(c)!=(count)) {
//						map.replace(c,1+count);
//						System.out.println("map c "+map.get(c)+" c "+c+" count"+count);
//						break;
//					}
//				}
//				if(!map.containsValue(count)&&k==strs[j].length()) {
//					li.add(strs[j]);
//					
//					vis[j]=1;
//				}
//				System.out.println("li2 "+li.toString());
//			}
//			list.add(li);
//		}
//		return list;
    }
}
