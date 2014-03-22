import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Read a file into a String in ONE LINE - Java 8+ only!!
 * Adapted from Adam Bien's blog at
 * http://www.adam-bien.com/roller/abien/entry/java_8_reading_a_file
 */
public class ReadFileIntoString {
	public static void main(String[] args) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(args[0])));
		System.out.println("Read string of length %d from file %s%n", content.length, args[0]);
	}
}
