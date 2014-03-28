import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.net.URI;
import java.net.URISyntaxException;
/**
*   Remember if you use a try with reosurces block, 
*   the classes MUST implement java.lang.AutoClosable
*/
public class TryWithResource {
	public static void main(String[] args) {
        try (BufferedReader inputReader = Files.newBufferedReader(
                Paths.get("users.txt"), Charset.defaultCharset());
             BufferedWriter outputWriter = Files.newBufferedWriter(
                 Paths.get(new File("users.bak").toURI()), Charset.defaultCharset()) 
                //Old fashion, URISyntaxException must be handled
                /*Paths.get(
                new URI("file:///Users/maciio/webProjects/mine/java7-cook-by-example/TryWithResources/users.bak")), 
                Charset.defaultCharset())*/
            ) 
        {
            String inputLine;
            while ((inputLine = inputReader.readLine()) != null) {
                System.out.println("Line to be copied: "+ inputLine);
                outputWriter.write(inputLine);
                outputWriter.newLine();
            }
            System.out.println("Copy complete!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}