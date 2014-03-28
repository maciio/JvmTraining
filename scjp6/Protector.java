public class Protector {
	//metodo!!!
	void Protector() {
		System.out.println("void constructor");
	}
	Protector() {
		System.out.println("default constructor");
	}
	public Protector(int z) {
		System.out.println("int constructor");
		new Protector();
	}

	public static void main(String[] args) {
		// Protector protector1 = new Protector();
		Protector protector2 = new Protector(5);
	}
}