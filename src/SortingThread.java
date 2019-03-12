public class SortingThread {
	private SortingAlgorithm algorithm; 
	
	public SortingThread(SortingAlgorithm algorithm) {
		this.algorithm = algorithm; 
	}
	
	public void run() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.nanoTime();
				algorithm.run();
				long endTime = System.nanoTime();
				long durationInNano = endTime - startTime;
				
				System.out.println(
						algorithm.getClass().getSimpleName() + ": " + (durationInNano / Math.pow(10, 9)) + "s"
						+ "\nResult: " + algorithm.getArray() + "\n"
				); 
			}
		});
		thread.start(); 
	}
}
