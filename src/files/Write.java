package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Write {
    public static void main(String[] args) {
	//1 . Define the path that we want to write
	Path path = Paths.get("src/files/FileToWrite.txt");
	String filename = path.toString();
	String message = "I am writing data that will be placed to a file";

	//2. Create the file in Java
	File file = new File(filename);

	try {
	    //3. Open the file
	    FileWriter fw = null;
	    fw = new FileWriter(file);

	    //4. Write to the file
	    fw.write(message);

	    //5. Close the resources
	    fw.close();
	} catch (IOException e) {
	    System.out.println("Error: Count not write file: " + filename);
	    e.printStackTrace();
	} finally {
	    System.out.println("Closing the file writer");
	}


    }
}
