//建立一个描述堆的对象
public class MyHeap {
	//堆的基本属性heap_size
	public int heap_size;
	public int[] arr;
	public MyHeap(int[] arr){
		heap_size = arr.length;
		//此处用来放置堆的数组是原数组长度的两倍，因而可以再插入元素直到扩大到原来的一倍长度
		this.arr = new int[arr.length*2];
		for(int i = 0; i < arr.length; i++)
			this.arr[i] = arr[i];
		buildMaxHeap(this.arr);
		
	}
	
	//堆的基本操作，寻找父子结点
	public  int parent(int i){
		return (i-1)/2;
	}
	
	public  int left(int i){
		return 2*i + 1;
	}
	
	public  int right(int i){
		return 2*(i+1);
	}
	
	//维护最大堆的性质
	public void maxHeapify(int[] arr, int i){
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l < heap_size && arr[l] > arr[i])
			largest = l;
		if(r < heap_size && arr[r] > arr[largest])
			largest = r;
		if(largest != i){
			swap(arr,i,largest);//交换两者位置
			maxHeapify(arr, largest);
		}
	}

	private void swap(int[] arr, int i, int largest) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}
	
	//构建最大堆
	private void buildMaxHeap(int[] arr){
		for(int i = arr.length/2; i >= 0; i--)
			maxHeapify(arr, i);
	}

}
