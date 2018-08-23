import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(123));
		list.add(90);
		list.add(10);
		list.add(67);
		list.add(90);
		
		System.out.println("Number of elements: " + list.size());
		
		System.out.println("Before addition: " + list);
		
		list.add(2, 88);
		
		System.out.println("After addition: "  + list);
		
		list.remove(0);
		
		System.out.println("Removing element at index 0: " + list);
		
		list.remove(new Integer(90));
		
		System.out.println("Removing element 90: " + list);

	}

}
