import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int number = scanner.nextInt();
        int table_size = 10;
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 0; i < table_size; i++) {
            int multiplier = i + 1;
            int result = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + result);
        }
    }
}
