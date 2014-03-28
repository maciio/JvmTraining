public class TestAnimals { 
	public static void main (String [] args) {
		Animal a0 = new Animal();
		Animal a = new Horse();
		Horse b = new Horse(); //Animal ref, but a Horse object
		try {
			a0.eat();
			a.eat();
		}
		catch (Exception e) {
//			e.stacktrace();
		}

		b.eat(); 
		a.drink();
		b.drink();
	}
} 
class Animal {
	public void eat()throws Exception{ 
		System.out.println("Generic Animal Eating Generically");
	}
	public String drink(){
		System.out.println("Animal Drinking");
		return "";
	}
	
} class Horse extends Animal {
	public void eat() { // check no Exception!!!
		System.out.println("Horse eating hay, oats, "+ "and horse treats");
	}
	public void printSomething(){
		System.out.println("<<Something>>");
		//super.eat();
	}
	public String drink(){
		return "Hola";
	}

}