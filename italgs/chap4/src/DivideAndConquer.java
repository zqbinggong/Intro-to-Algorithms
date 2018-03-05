
public class DivideAndConquer {
//最大子数组问题	
	//创造一个数组来储存得到的最大子数组的左右端点位置和元素之和
	private static int[] re = new int[3];
	private static int[] re_l = new int[3];
	private static int[] re_r = new int[3];
	private static int[] re_c = new int[3];
	//选找和最大的连续非空子数组
	public static int[] findMaximumSubarray(int[] arr, int low, int high){
		if(low == high){
			re[0] = re[1] = low;
			re[2] = arr[low];
			return re;
		}else{
			int mid = (low + high)/2;
			re_l = findMaximumSubarray(arr,low,mid);
			re_r = findMaximumSubarray(arr,mid+1,high);
			re_c = findMaxCrossSubarray(arr,low,mid,high);
		}
		if(re_l[2] >= re_r[2] && re_l[2] >= re_c[2])
			return re_l;
		else if(re_r[2] >= re_l[2] && re_r[2] >= re_c[2])
			return re_r;
		else
			return re_c;
		
	}
	private static int[] findMaxCrossSubarray(int[] arr, int low, int mid,
			int high) {
		int left_sum = -Integer.MAX_VALUE,right_sum = -Integer.MAX_VALUE;
		int max_left=0,max_right=0;//此处需要初始化，否则47,48会报错
		int sum = 0;
		for(int i = mid; i >=low; i-- ){
			sum += arr[i];
			if(sum>left_sum){
				left_sum = sum;
				max_left = i;
			}
		}
		sum = 0;
		for(int i = mid+1; i <=high; i++ ){
			sum += arr[i];
			if(sum>right_sum){
				right_sum = sum;
				max_right = i;
			}
		}
		re_c[0] = max_left;
		re_c[1] = max_right;
		re_c[2] = left_sum + right_sum;

		
		return re_c;
	}

//
}
