public class WrapperTest {
	static Integer z;
	static String cadena;
	static Integer valor;
	public static void main(String ... args) {
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		WrapperTest w = new WrapperTest();
		int z;
		Prueba prueba;
		if(x == y) 
			System.out.println("Son iguales");
		if(x != y)
			System.out.println("Son diferentes");
//		System.out.println(z);
		// doStuff(z);	
		System.out.println("cadena: " + w.cadena);	
	}
	static void doStuff(int alfa) {
		int beta = 3;
		System.out.println(alfa);
	}
}