import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Числа кратные трем: ");
        printNumbers(array);
    }

    private static void printNumbers(int[] array){

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0){
                System.out.printf("%d ", array[i]);
            }
        }
    }
}