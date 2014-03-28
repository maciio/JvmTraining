import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.net.*;

public class ReflectiveOperationExceptionExample {
	public static void main(String ... args) {
		try {
			deleteFile(Paths.get(new URI))
		} catch (URISyntaxisException ex) {
			ex.printStackTrace();
		}
	}

	private static deleteFile(Path path) throws NoSuchFileException, 
												DirectoryNotEmptyException {
		try {
			Files.delete(path);
		} catch (IOException e) {
			if (path.toFile().isDirectory()) {
				throw new DirectoryNotEmptyException();
			} else {
				throw new NoSuchFileException();
			}
		}

	}
}