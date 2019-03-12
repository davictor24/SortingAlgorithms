import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class QuickSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public QuickSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		quickSort(0, array.size() - 1); 
	}
	
	private void quickSort(int i, int j) {
		if (i >= j) return; 
		int pivot = array.get(i); 
		int k = i; 
		for (int ind = i + 1; ind <= j; ind++) {
			if (array.get(ind) < pivot) {
				Collections.rotate(array.subList(i, ind + 1), 1);
				k++; 
			}
		}
		quickSort(i, k - 1); 
		quickSort(k + 1, j); 
	}
}
