package sorting;

public class Heap_sorting {
	int[] input_heap;
	int heap_size;

	public Heap_sorting(int[] input_heap) {
    // set entered information to variables:
		this.input_heap = input_heap;
		this.heap_size = input_heap.length;
    // call the first method to start the Process:
		build_heap();
	}

	public int[] get() {
    // send the sorted array out:
		return input_heap;
	}

	private void build_heap() {
    // applay the Max heap attribute to array:
		for (int i = heap_size / 2 - 1; i >= 0; i--) {
			heapify(i);
		}
    // now the we have a Max heap but we want a sorted array not a heap with sorted roots:
		heap2line();
	}

	private void heap2line() {
    // take max element out of heap and re-build the heap:
		for (int i = heap_size - 1; i > 0; i--) {
			exchange(0, i);
			heap_size--;
			heapify(0);
		}
	}

	private void heapify(int input) {
    //apply the max heap attribute for parent and two (or one) roots:
		int largest = input;
		int left = left(input);
		int right = right(input);
		if (left < heap_size && input_heap[largest] < input_heap[left]) {
			largest = left;
		}
		if (right < heap_size && input_heap[largest] < input_heap[right]) {
			largest = right;
		}
		if (largest != input) {
			exchange(input, largest);
      // if we have change in heap's structure, we should check the Max heap attribute for changed element;
      // the interesting part of code is here, use Recursion: 
			heapify(largest);
		}
	}
  
  // just a very simple method to exchange 2 element in array:
	private void exchange(int input1, int input2) {
		int temp = input_heap[input1];
		input_heap[input1] = input_heap[input2];
		input_heap[input2] = temp;
	}
  
  // get the left index of parent(heap) in array: 
	private int left(int input) {
		return input * 2 + 1;
	}
  // get the right index of parent(heap) in array:
	private int right(int input) {
		return input * 2 + 2;
	}
}
