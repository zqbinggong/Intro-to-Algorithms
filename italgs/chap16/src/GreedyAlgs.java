import java.util.HashSet;
import java.util.Set;


public class GreedyAlgs {
	
	//活动选择问题
	public static HashSet actSelector(int[] s, int[] f){
		int n = s.length;
		HashSet hs = new HashSet();
		hs.add(Integer.toString(1));
		int k = 1;
		for(int m = 2; m <= n; m++){
			if(s[m-1] >= f[k-1]){
				hs.add(Integer.toString(m));
				k = m;
			}
		}
		return hs;
		
	}
	
	
	
	
	
	
	
	

}
