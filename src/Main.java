import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*
         *
         * BufferReader + FileReader: best for reading text files line-by-line
         * FileInputStream: best for binary files (e.g. images, audio files)
         * RandomAccessFile: best for read/write portions of a large file
         * */

        String filePath = "C:\\Users\\user\\OneDrive\\Desktop\\home-page.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");

        } catch (IOException e) {
            System.out.println("Something went wrong");

        }
    }
}
