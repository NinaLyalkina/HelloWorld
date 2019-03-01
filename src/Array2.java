import java.util.Scanner;

public class Array2{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int [] [] in = new int[2] [4];
        System.out.println("Введите элементы матрицы>>>");


        for (int i = 0; i<2; i++){

            for (int j = 0; j<4; j++){

                in [i][j] = a.nextInt();
            }
        }
        System.out.println(in [0][0]*3 + "\n" + in [0][1]*3 + "\n" + in [0][2]*3 + "\n" + in [0][3]*3);
    }
}