import java.util.List; 
import java.util.ArrayList;
import java.util.Collections; 

public class InsertionSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public InsertionSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		for (int i = 1; i < array.size(); i++) {
			int j = i; 
			while (j > 0 && array.get(j) < array.get(j - 1)) Collections.swap(array, j, --j); 
		}
	}
}
