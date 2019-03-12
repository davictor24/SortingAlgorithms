import java.util.List; 
import java.util.ArrayList; 

public class MergeSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public MergeSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		mergeSort(array); 
	}
	
	private void mergeSort(List<Integer> array) {
		int n = array.size(); 
		if (n == 1) return; 
		List<Integer> left = new ArrayList<>(array.subList(0, n/2)); 
		List<Integer> right = new ArrayList<>(array.subList(n/2, n)); 
		mergeSort(left); 
		mergeSort(right); 
		int i = 0, j = 0, k = left.size(), l = right.size(); 
		while (i + j < n) {
			if (j >= l || (i < k && left.get(i) <= right.get(j))) array.set(i + j, left.get(i++)); 
			else if (i >= k || (j < l && right.get(j) < left.get(i))) array.set(i + j, right.get(j++)); 
		}
	}
}
