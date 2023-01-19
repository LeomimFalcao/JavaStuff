import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dê entrada do seu nome, Sr(a) Usuario(a)");
        String nome = scanner.nextLine();

        System.out.printf("Hello, %s ", nome);
    }
}