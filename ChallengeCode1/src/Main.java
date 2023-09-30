import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            printHello(scanner.nextInt());
        }
    }

    private static void printHello(int number){

        if(number > 7){
            System.out.println("Hello");
        }
    }
}