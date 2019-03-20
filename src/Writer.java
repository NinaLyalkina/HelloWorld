import java.io.*;

public class Writer {
    public Writer(String s) {

    }

    public static void main(String args[]) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные в файл. Для остановки записи нажмите Enter и введите 'stop'");

        try {
            FileWriter fw = new FileWriter("test.txt");


            do {
                System.out.print(": ");
                s = br.readLine();

                if (s.compareTo("stop") == 0) break;
                fw.write(s);
            } while (s.compareTo("stop") != 0);
            fw.close();
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }

    private void write(String s) {
    }
}

