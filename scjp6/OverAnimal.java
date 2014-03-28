class Animal { } 
class Horse extends Animal { } 
public class OverAnimal {
	public void doStuff(Animal a) { System.out.println("In the Animal version");
	} 
	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	} 
	public static void main (String [] args) {
		OverAnimal ua = new OverAnimal(); 
		Animal animalObj = new Animal(); 
		Horse horseObj = new Horse(); 
		Animal animal = new Horse();
		ua.doStuff(animalObj); 
		ua.doStuff(horseObj);
		ua.doStuff(animal);
	}
}