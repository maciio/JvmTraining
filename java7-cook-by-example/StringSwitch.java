public class StringSwitch {
	public static void main(String[] args) {
		// String argument = null;
		for (String argument : args) {
			switch (argument) {
				case "-verbose":
				case "-v":
					System.out.println("it's verbose");
					break;
				case "-log":
					System.out.println("it's log");
					break;
				case "-help":
					System.out.println("it's help");
					break;
				default:
					System.out.println("Illegal command line argument");	
			}
		}
	}
}