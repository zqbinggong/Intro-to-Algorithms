
public class LinearTimeSort {
	
	//计数排序,版本1,稳定但不是原址排序
	public static void countSort(int[] a, int b[], int k){
		int[] c = new int[k+1];
		for(int i = 0; i < a.length; i++)
			c[a[i]] += 1;
		for(int i = 1; i < k+1; i++)
			c[i] += c[i-1];
		for(int i = a.length-1; i >= 0; i--){
			b[c[a[i]]-1] = a[i];//注意这里有个减1的操作
			c[a[i]] -= 1;
		}
		
	}
	
	//计数排序,版本2,原址但不稳定
	public static void countSort2(int[] a, int k){
		int[] c = new int[k+1];
		for(int i = 0; i < a.length; i++)
			c[a[i]] += 1;
		int p = 0;
		for(int i = 0; i <= k; i++)
			for(int j = 0; j < c[i]; j++)
				a[p++] = i;
	}
	
	
	
	
	

}