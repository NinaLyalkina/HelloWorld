import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        String s;
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader("test.txt"));


            while ((s = br.readLine()) != null)
                System.out.println(s);
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}