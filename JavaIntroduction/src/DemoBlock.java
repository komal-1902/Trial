
public class DemoBlock {
	
	public DemoBlock() {
		System.out.println("Constructor invoked");
	}
	
	{
		System.out.println("Non-static block invoked");
	}
	
	static {
		System.out.println("Static block invoked");
	}
	
	public void display() {
		System.out.println("Display function invoked");
	}
	
	public static void show() {
		System.out.println("Show function invoked");
	}
	
	public static void main(String args[]) {
		//DemoBlock.show();
		DemoBlock db = new DemoBlock();
		DemoBlock db1 = new DemoBlock();
		//db.display();
		
	}

}
