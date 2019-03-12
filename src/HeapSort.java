import java.util.List; 
import java.util.ArrayList; 

public class HeapSort implements SortingAlgorithm {
	private List<Integer> array; 
	
	public HeapSort(List<Integer> array) {
		this.array = new ArrayList<>(array); 
	}
	
	public List<Integer> getArray() {
		return array; 
	}
	
	public void run() {
		
	}
}
