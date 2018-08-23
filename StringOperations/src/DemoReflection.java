import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class DemoReflection {

	public static void main(String[] args) {
		
		Class class1;
		try {
			class1 = Class.forName("java.lang.String");
			System.out.println("Name: " + class1.getCanonicalName());
			
			Constructor[] constructors = class1.getConstructors();
			
			for(Constructor c : constructors) {
				Type[] types = c.getGenericParameterTypes();
				for(Type t : types) {
					System.out.print(t.getTypeName() + " ");
				}
				System.out.println();
			}
			
		}
		catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}

	}

}
