
public class Demo1D {

	public static void main(String[] args) {

		int[] numbers;
		
		numbers = new int[5];
		
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 3;
		numbers[3] = 5;
		numbers[4] = 6;
		
		int sumOfNumbers = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		
		System.out.println("Array: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Sum of numbers of the array: " + sumOfNumbers);

	}
	
	

}
