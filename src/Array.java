import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        int [] in = new int[10];
        int i;
        Scanner a = new Scanner(System.in);
        System.out.println("Введите 10 чисел>>>");

        for (i = 0; i<10; i++){
            in[i] = a.nextInt();

        }
        for (i = 0; i<10; i++){
            System.out.println(in[i]*2);
        }
    }
}