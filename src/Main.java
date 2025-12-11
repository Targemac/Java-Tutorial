import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
         * How to write a file using Java
         *
         * 1. FileWriter = good for small or medium-sized text files
         * 2. BufferWriter = Better performance for large amounts of text
         * 3. PrintWriter = best for structured data, like reports or logs
         * 4. FileOutputStream = best for binary files (e.g. images, audio files)
         * */
        String filePath = "C:\\Users\\user\\OneDrive\\Desktop\\test.txt";
        //        String textContent = "I like rice!😂💡💡";
        String textContent = """
                this is a multipline text, 
                if you get what i mean
                end
                """;


        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written!");
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
