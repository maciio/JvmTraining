import java.util.*;
         public class PirateTalk {
           public static void main(String... arrrrgs) {
             Properties p = System.getProperties();
             p.setProperty("pirate", "scurvy");
             String s = p.getProperty("argProp") + " ";
             s += p.getProperty("pirate");
             System.out.println(s);
         } }