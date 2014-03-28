import java.util.*;
       public class Volleyball {
         public static void main(String[] args) {
           TreeSet<String> s = new TreeSet<String>();
           s.add("a");  s.add("f");  s.add("b");
           System.out.print(s + " ");
           Collections.reverse(s);
           System.out.println(s);
 } }