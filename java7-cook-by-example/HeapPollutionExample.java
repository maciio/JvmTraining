import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HeapPollutionExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
           list1.add("One");
           list1.add("Two");
           list1.add("Three");
           List<String> list2 = new ArrayList<>();
           list2.add("Four");
           list2.add("Five");
           list2.add("Six");
           merge(list1,list2);

	}

	@SafeVarargs // Not actually safe!
   	static void merge(List<String>... stringLists) {
    	Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings - 1
        String element = stringLists[0].get(0); // runtime ClassCastException
   }

   /*
		A REIFIABLE type is a type whose type information is fully available 
	 	at runtime.

		NON-REIFIABLE types are types where information has been removed 
		at compile-time by type erasure — invocations of generic types 
		that are not defined as unbounded wildcards. A non-reifiable type 
		does not have all of its information available at runtime. 
		Examples of non-reifiable types are List<String> and List<Number>; 
		the JVM cannot tell the difference between these types at runtime.

	1.- Heap pollution occurs when a variable of a parameterized type 
		refers to an object that is not of that parameterized type or 
		a different type that used to defined it. 
   */
}