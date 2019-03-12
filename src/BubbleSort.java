import java.util.List; 
import java.util.ArrayList;
import java.util.Collections; 

public class BubbleSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public BubbleSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		while (traverse()); 
	}
	
	private boolean traverse() {
		boolean swapOccurred = false; 
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i) > array.get(i + 1)) {
				Collections.swap(array, i, i + 1);
				swapOccurred = true; 
			}
		}
		return swapOccurred; 
	}
}
