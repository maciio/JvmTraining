public class Overloading{
	public static void main(String [] args){
		Overloading a = new MiniOverloading();
		Overloading b = new Overloading();
		MiniOverloading c = new MiniOverloading();
		
		a.change("hola",1);
		c.change(2,"mundo");
		//a.change(2,"mundo");//compile fail, because overloading cannot be applied
		a.make();
	}
	public void change(String x, int y){
		System.out.println("metodo change en Overloading\n");
	}
}
class MiniOverloading extends Overloading{
	public void change(int x, String y){
		System.out.println("\nmetodo change en MiniOverloading");
	}
	public void make(){
	
	}
}