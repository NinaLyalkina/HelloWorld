import java.util.Scanner;

public class excercise2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива>>>");
        int length = in.nextInt();
        int[] array = new int[length];


        System.out.println("Введите элементы массива>>>");


        int i;
        for (i = 0; i < length; i++) {

        array[i] = in.nextInt();
        }


        for (i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {

                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (i = 0; i < length; i++) {
            System.out.println(array[i]);
        }


    }

}
