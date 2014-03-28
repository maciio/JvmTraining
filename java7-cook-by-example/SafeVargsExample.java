import java.util.ArrayList;

public class SafeVargsExample {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(new Integer(1));
		a1.add(2);
		ArrayList<Float> a2 = new ArrayList<>();
		a2.add(3.1f);
		a2.add(new Float(4.2));

		displayElements(a1, a2, 10.1);
	}

	@SafeVarargs
	public static <T> void displayElements(T ... elements) {
		for(T element : elements) {
			System.out.println(element.getClass().getName() + ": " + element);
		}
	}
}