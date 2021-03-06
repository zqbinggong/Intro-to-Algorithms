
public class HeapTools {
	//////////////////////////////////////////////////////////////////////////////////
	//堆排序
	public static void heapSort(int[] arr){
		MyHeap heap = new MyHeap(arr);
		for(int i = heap.heap_size - 1; i <= 1; i--){
			swap(heap.arr,i,0);
			heap.heap_size -= 1;
			heap.maxHeapify(heap.arr, 0);
			arr = heap.arr;
		}
	}
	private static void swap(int[] arr, int i, int largest) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}
//////////////////////////////////////////////////////////////////////////////////////////	
	//优先队列部分
	//返回最大值
	public static int maximum(MyHeap heap){
		return heap.arr[0];
	}
	
	//删除并返回最大元素，保持结构不变
	public static int heapExtractMax(MyHeap heap){
		if(heap.heap_size < 1)
			return -1;
		int max = heap.arr[0];
		heap.arr[0] = heap.arr[heap.heap_size-1];
		heap.heap_size -= 1;
		heap.maxHeapify(heap.arr, 0);
		return max;
	}
	
	//将指定元素增加至指定值
	public static void heapIncreaseKey(MyHeap heap,int i,int key){
		if(key <= heap.arr[i])
			;
		while(i > 0 && heap.arr[heap.parent(i)] < key){
			heap.arr[i] = heap.arr[heap.parent(i)];
			i = heap.parent(i);
		}
		heap.arr[i] = key;
	}
	
	//插入元素
	public static void maxHeapInsert(MyHeap heap, int key){
		heap.heap_size += 1;
		if(heap.heap_size > heap.arr.length)
			;
		heap.arr[heap.heap_size - 1] = -Integer.MAX_VALUE;
		heapIncreaseKey(heap, heap.heap_size - 1, key);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
}
