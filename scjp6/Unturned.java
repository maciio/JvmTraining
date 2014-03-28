import java.util.*;
public class Unturned {
	public static void main(String[] args) {
  		String[] towns = {"aspen", "vail", "t-ride", "dillon"};
  		MySort ms = new MySort();
     	Arrays.sort(towns, ms);
     	// Arrays.sort(towns);
     	System.out.println(Arrays.binarySearch(towns, "dillon"));
 	}
	static class MySort implements Comparator<String> {
	  public int compare(String a, String b) {
	  	return b.compareTo(a);
	  } 
	} 
}