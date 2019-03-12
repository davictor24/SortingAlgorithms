import java.util.List; 
import java.util.ArrayList;
import java.util.Collections; 

public class SelectionSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public SelectionSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		int n = array.size(); 
		for (int i = 0; i < n; i++) {
			int smallest = Integer.MAX_VALUE, smallestInd = -1; 
			for (int j = i; j < n; j++) {
				if (array.get(j) < smallest) {
					smallest = array.get(j); 
					smallestInd = j; 
				}
			}
			Collections.rotate(array.subList(i, smallestInd + 1), 1); 
		}
	}
}
