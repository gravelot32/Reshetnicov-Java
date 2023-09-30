import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            printName(scanner.nextLine());

    }
    private static void printName(String name){

        if(name.equals("Вячеслав")){
            System.out.printf("Привет, %s", name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}