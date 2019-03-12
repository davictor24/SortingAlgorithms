import java.util.List; 

public class Main {
	public static void main(String [] args) {
		List<Integer> array = ArrayGenerator.getRandomArray(100, 1, 100); // n, minimum, maximum
		
		BubbleSort bubbleSort = new BubbleSort(array); 
		SelectionSort selectionSort = new SelectionSort(array); 
		QuickSort quickSort = new QuickSort(array); 
		InsertionSort insertionSort = new InsertionSort(array); 
		MergeSort mergeSort = new MergeSort(array); 
		HeapSort heapSort = new HeapSort(array); 
		AVLTreeSort avlTreeSort = new AVLTreeSort(array); 
		CountingSort countingSort = new CountingSort(array); 
		RadixSort radixSort = new RadixSort(array); 
		
		runAlgorithm(bubbleSort); 
		runAlgorithm(selectionSort); 
		runAlgorithm(quickSort); 
		runAlgorithm(insertionSort); 
		runAlgorithm(mergeSort); 
		runAlgorithm(heapSort); 
		runAlgorithm(avlTreeSort); 
		runAlgorithm(countingSort); 
		runAlgorithm(radixSort); 
	}
	
	public static void runAlgorithm(SortingAlgorithm algorithm) {
		SortingThread sortingThread = new SortingThread(algorithm); 
		sortingThread.run(); 
	}
}
