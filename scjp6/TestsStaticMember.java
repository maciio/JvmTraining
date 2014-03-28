public class TestsStaticMember {
	 static String atributo = "xyz";
	 public  String fast(){return "fast";}
	 public static void main(String[] args) {
	 	System.out.println(new StaticSon().fast());
	 	System.out.println(new TestsStaticMember().fast());
	 	// System.out.println(StaticSon.atributo);
	 	System.out.println(new StaticSon().atributo);
	 }
}
class StaticSon extends TestsStaticMember {
	String atributo = "hola";
	public  String fast() {
		// assert (false): "es true";
		System.out.println(atributo);
		return "";
	}	
}