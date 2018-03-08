
public class QuickSort {
	//////////////////////////////////////////////////////////////////////////////////////
	//原始版本
	//快速排序
	public static void quickSort(int[] arr, int p, int r){
		if(p < r){
			int q = partition(arr,p,r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1,r);
		}
	}
	//分部
	private static int partition(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		int x = arr[r];
		int i = p - 1;
		for(int j = p; j <= r-1; j++){
			if(arr[j] <= x){
				swap(arr,++i,j);
			}
		}
		swap(arr,i+1,r);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
	//习题7-2,针对相同元素的快速排序
	static int[] id; //用来存储下标
	public static void quickSortSame(int[] arr, int p, int r){
		if(p < r){
			id = partitionSame(arr,p,r);
			quickSort(arr, p, id[0]-1);
			quickSort(arr, id[1]+1,r);
		}
	}
	private static int[] partitionSame(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		int[] index = new int[2];
		
		/*此过程有误
		int i = partition(arr, p,r);
		int j = i;
		while(i > 0 && arr[i-1] == arr[i])
			i--;
		while(j < r-1 && arr[j+1] == arr[j])
			j++;
		*/
		int x = arr[p];
		int i = p;
		int h = p;
		for(int j = p+1; j <= r; j++){
			if(arr[j] < x){
				int y = arr[j];
				arr[j] = arr[h+1];
				arr[i++] = y;
				h++;
			}else if(arr[j] == x){
				swap(arr,h+1,j);
				h++;
			}
		}
		index[0] = i;
		index[1] = h;
		return index;
	}

	//////////////////////////////////////////////////////////////////////////////////////
	//习题7-4,快速排序的栈深度，尾递归
	public static void tailRecursiveQuickSort(int[] arr, int p, int r){
		while(p < r){
			int q = partition(arr, p, r);
			if(q-p < r-q){
				tailRecursiveQuickSort(arr, p, q-1);
				p = q + 1;
			}
			else{
				tailRecursiveQuickSort(arr, q+1, r);
				r = q - 1;
			}
		}
	}
	
	
	
	
	
}
