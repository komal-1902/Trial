import java.lang.reflect.Array;

public class Demo2D {

	public static void main(String[] args) {
		
		int[][] arrays;
		arrays = new int[3][3];
		
		int[] set = new int[] {1, 11, 21};
		
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[0].length; j++) {
				arrays[i][j] = set[i]++;
			}
		}
		
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[0].length; j++) {
				System.out.print(arrays[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
