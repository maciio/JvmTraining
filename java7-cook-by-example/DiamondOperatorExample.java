import java.util.List;
import java.util.ArrayList;

public class DiamondOperatorExample {
	public static void main(String[] args) {
		//This operator specify convention over configuration
		List<String> list = new ArrayList<>();
		
		useRawType();
		useExplicitType();
		useImplicitType();

		//This generates warnings, cuze the type is not obvious
		List arrayList = new ArrayList<>();
		arrayList.add("first");
		arrayList.add("second");
	}

	private static void useRawType() {
        List<String> arrayList = new ArrayList();
        arrayList.add("First");
        arrayList.add("Second");
        System.out.println(arrayList.get(0));
	}
    
    private static void useExplicitType() {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        System.out.println(arrayList.get(0));
	}
	
	private static void useImplicitType() {
	    List<String> arrayList = new ArrayList<>();
	    arrayList.add("First");
	    arrayList.add("Second");
	    System.out.println(arrayList.get(0));
	}
}