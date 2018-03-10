
public class SelectOrder {
	/////////////////////////////////////////////////////////////////////////////////
	//期望为线性时间的选择算法
	public static int randomSelect(int[] a, int p, int r, int i){
		if(p == r) return a[p];
		int q = randomPartition(a,p,r);
		int k = q-p+1;
		if(i == k) return a[i];
		else if(i < k) return randomSelect(a, p, q-1, i);
		else return randomSelect(a, q+1, r, i-k);
		
	}

	private static int randomPartition(int[] a, int p, int r) {
		// TODO Auto-generated method stub
		int m = (int) Math.round(Math.random()*(r-p)+p);
		int x = a[m];
		swap(a,m,r);
		int j = p-1;
		for(int l = p; l < r; l++){
			if(a[l] <= x){
				swap(a,l,++j);
			}
		}
		swap(a,r,++j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	///////////////////////////////////////////////////////////////////////////
	//寻找两个有序数组的中位数
	public static int twoArrayMedian(int[] a, int[] b){
		int m = findMedian(a,b,a.length,0,a.length-1);
		if(m == Integer.MAX_VALUE) m = findMedian(b,a,a.length,0,a.length-1);
		return m;
	}

	private static int findMedian(int[] a, int[] b, int n, int low,
			int high) {
		// TODO Auto-generated method stub
		if(low > high) return Integer.MAX_VALUE;
		else{
			int k = (low+high)/2;
			if(k == n-1 && a[n-1] <= b[0]) return a[n-1];
			else if(k < n-1 && b[n-k-1] <= a[k] && b[n-k] >= a[k]) return a[k];
			else if(a[k] > b[n-k]) return findMedian(a,b,n,low,k-1);
			else return findMedian(a,b,n,k+1,high);
		}
		
	}

}
