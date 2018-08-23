
public class DemoCmdLine {

	public static void main(String[] args) {
		
		System.out.println("No. of arguments: " + args.length);
		
		System.out.println("\nSum of arguments:");
		
		int sumOfArguments = 0;
		
		for(String arg : args) {
			sumOfArguments += Integer.parseInt(arg);
		}
		
		System.out.println(sumOfArguments);

	}

}
