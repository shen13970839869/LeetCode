package Com.Szy.Base;

import java.util.HashSet;
import java.util.Set;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Set<Integer> set;
 	public FindElements(TreeNode root) {
 		set = new HashSet<Integer>();
 		dfs(root,0);
    }
    
    public boolean find(int target) {
    	return set.contains(target);
    }
    public void dfs(TreeNode root,int val) {
    	if(root.val==null) {
    		return;
    	}
    	root.val=val;
    	set.add(val);
    	dfs(root.left,val*2+1);
    	dfs(root.right,val*2+2);
    }
}
