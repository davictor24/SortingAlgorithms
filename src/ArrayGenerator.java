import java.util.List;
import java.util.ArrayList; 
import java.util.Random; 

public class ArrayGenerator {
	public static List<Integer> getRandomArray(int n, int min, int max) {
		ArrayList<Integer> randomArray = new ArrayList<>(); 
		Random rand = new Random(); 
		for (int i = 0; i < n; i++) randomArray.add(rand.nextInt(max - min + 1) + min); 
		return randomArray; 
	}
}
