import java.util.HashSet;
import java.util.Iterator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[]{1,3,0,5,3,5,6,8,8,2,12};
		int[] f = new int[]{4,5,6,7,9,9,10,11,12,14,16};
		HashSet hs;
		hs = GreedyAlgs.actSelector(s, f);
		Iterator c = hs.iterator();
		while(c.hasNext())
			System.out.print(c.next());
		
		
//		for(Integer s : hs)
//			System.out.print(s);
		
		

	}

}
