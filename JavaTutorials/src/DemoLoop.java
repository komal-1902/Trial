
public class DemoLoop {

	public static void main(String[] args) {
		
		int[] array = {12, 34, 44, 54, 34, 55, 65, 78, 90, 23, 90};
		
		int i = 0;
		while(i < array.length) {
			System.out.print(array[i++] + " ");
		}
		System.out.println();
		
		i = 0;
		int search = 54;
		boolean flag = false;
		
		while(i < array.length) {
			if(array[i] == search) {
				flag = true;
			}
			i++;
		}
		
		if(flag) {
			System.out.println("Value found");
		}
		else {
			System.out.println("Value not found");
		}
		

	}

}
