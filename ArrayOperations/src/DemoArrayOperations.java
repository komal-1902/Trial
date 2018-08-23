import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		
		int[] numbers = {123, 43, 15, 76, 86, 43, 90, 24, 14, 64};
		
		//Arrays.fill(numbers, 10);
		//Arrays.fill(numbers,  1, 3, 5);
		
		int[] numbers_copy = Arrays.copyOf(numbers, 5);
		int[] numbers_copy_range = Arrays.copyOfRange(numbers, 0, 5);
		
		boolean check = Arrays.equals(numbers_copy, numbers_copy_range);
		System.out.println("Are two arrays equal? " + check);
		
		Arrays.sort(numbers);
		
		System.out.println("14 is at position: " + Arrays.binarySearch(numbers, 104));
		
		
		for(int num : numbers) {
			System.out.print(num + " ");
		}

	}

}
