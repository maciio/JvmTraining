import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.net.*;

public class ReflectiveOperationExceptionExample {
	public static void main(String ... args) {
		try {
			deleteFile(Paths.get(new URI("file:///tmp.txt")));
		} catch (URISyntaxException | IOException ex ) {
			ex.printStackTrace();
		}
	}

	private static void deleteFile(Path path) throws NoSuchFileException, 
												DirectoryNotEmptyException {
		try {
			Files.delete(path);
		} catch (IOException e) {
			if (path.toFile().isDirectory()) {
				throw new DirectoryNotEmptyException(null);
			} else {
				throw new NoSuchFileException(null);
			}
		}

	}
}