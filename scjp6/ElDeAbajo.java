import java.util.*;

public class ElDeAbajo {
	public static void main(String[] args) {
			System.out.println(0%4);
			System.out.println(3/2);
			int x = 10;
			int y = 1; //initialization error por los if posteriores
			// y = 9;
			// if( x < 100) y = x/0;
			if (x >= 100) y = x*0;
			System.out.println(y);
			int a = 0;
			int b = 1;
			int c = 2;
			int [] w = {a,b,c};
			// f(a,b,c);
			double qw = 65676676786.66;
			char qw2 = 65;
			System.out.printf("%c ", qw2);
			System.out.printf("%5.9f ", qw);
			f(w);

			List<Number> lista = new LinkedList<Number>();
			lista.add(1);
			lista.add(2);
			lista.add(3);

			// for (Iterator i = lista.iterator(); i.hasNext();) {
			// 	Integer nuevo = (Integer)i.next();
			// 	System.out.println(nuevo);
			// }
			Integer h = (Integer)lista.get(1);
			System.out.println(new Boolean(null));
			boolean zz = 1;

	}

	public static void f(Integer ... x){ System.out.println("Integer array"); }
	public static void f(int [] x){ System.out.println("int array");}

	static String f(int i){
	    switch(i){
			case 0:return"A";
			case 1:return"B";
			case 2:return"C";
			default:return "";
		}
    } 

}