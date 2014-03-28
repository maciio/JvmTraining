import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListContains {

  public static void main(String[] a) {
    String elements[] = { "A", "B", "C", "D", "E" }; //lista de respuestas
    Set set = new HashSet(Arrays.asList(elements));

    elements = new String[] { "A", "B", "C" }; 		 //respuestas disponibles
    Set set2 = new HashSet(Arrays.asList(elements));

    System.out.println(set2.containsAll(set));
  }
}