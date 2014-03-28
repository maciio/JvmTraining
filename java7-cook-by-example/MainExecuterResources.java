public class MainExecuterResources {
	public static void main(String[] args) {
		try (FirstAutoCloseableResource fisrt = new FirstAutoCloseableResource();
			 SecondAutoCloseableResource second = new SecondAutoCloseableResource(); 
			 ) {
			fisrt.manipulateResource();
			second.manipulateResource();
		} catch (Exception e) {
			e.printStackTrace();
			for(Throwable throwable : e.getSuppressed()) {
				// System.out.println(throwable);
			}
		}	
	}
}

class FirstAutoCloseableResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
	// Close the resource as appropriate
		System.out.println("FirstAutoCloseableResource close method executed");
		throw new UnsupportedOperationException("A problem has occurred in FirstAutoCloseableResource");
	}
	public void manipulateResource() {
		// Perform some resource specific operation
		System.out.println("FirstAutoCloseableResource manipulateResource method executed");
	}
}
class SecondAutoCloseableResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
		// Close the resource as appropriate
		System.out.println("SecondAutoCloseableResource close method executed");
		throw new UnsupportedOperationException("A problem has occurred in SecondAutoCloseableResource");
	}	
	public void manipulateResource() {
		// Perform some resource specific operation
		System.out.println("SecondAutoCloseableResource manipulateResource method executed");
	}
}