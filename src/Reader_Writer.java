import java.io.*;

public class Reader_Writer {
    public static void main(String[] args) {
        String s;
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader("C://Users//Анатолий//test2.txt"));


            while ((s = br.readLine()) != null)
                System.out.println(s);
        } catch (IOException exc) {
            System.out.println(exc);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите новые данные в файл");

        try {
            FileWriter fw =new FileWriter("C://Users//Анатолий//test2.txt", false);
            System.out.print(": ");
            s = br.readLine();
            fw.write(s);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}