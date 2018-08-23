
public class DemoJagged {
	
	public static void main(String[] args) {
		
		int[][] values = new int[3][];
		
		values[0] = new int[4];
		values[1] = new int[2];
		values[2] = new int[5];

		int start = 1;
		for(int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[i].length; j++) {
				values[i][j] = start++;
			}
		}
		
		for(int[] arr: values) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	}

}
