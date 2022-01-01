import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import the main pakage of heap sorting:
import sorting.Heap_sorting;

public class Sort_tester {

	public static void main(String[] args) throws NumberFormatException, IOException {
    // create a stream from console to get input:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array:");
		int size = Integer.valueOf((String) br.readLine());
    // create an array:
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + ". ");
			array[i] = Integer.valueOf((String) br.readLine());
		}
    // show the out of sorts array:
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
    // first, create a heap sorting object then send the array for sorting and get the sorted array with get method:
		for (int i : new Heap_sorting(array).get()) {
			System.out.print(i + " ");
		}
	}
}
