
public class ArraySorts {
	int i,j,q;
	int key;
	
	//插入排序
	public int[] InsertSort(int[] arr){
		for(i = 1; i < arr.length; i++){
			key = arr[i];
			j = i - 1;
			while(j>0 && arr[j] > key)
				arr[j+1] = arr[j++];
			arr[j+1] = key;
		}
		return arr;
	}
	
	//归并排序
	public int[] mergeSort(int[] arr, int p, int r){
		q = (r-p+1)/2;
		mergeSort(arr,p,q);
		mergeSort(arr,q+1,r);
		merge(arr,p,q,r);
		
		return arr;
		
	}
	//归并排序中的合并操作
	private void merge(int[] arr, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1 = p-q+1;
		int n2 = r-q;
		int[] arr1 = new int[n1+1];
		int[] arr2 = new int[n2+1];
		for(i = 0;i < n1;i++)
			arr1[i] = arr[p+i];
		arr[n1+1] = Integer.MAX_VALUE;
		for(i=0;i < n2;i++)
			arr2[i] = arr[q+i+1];
		arr[n2+1] = Integer.MAX_VALUE;
		i = j = 0;
		for(int k = p; p <= r; k++){
			if(arr1[i] < arr2[j])
				arr[k] = arr1[i++];
			else
				arr[k] = arr2[j++]
		}
		
	}
}
