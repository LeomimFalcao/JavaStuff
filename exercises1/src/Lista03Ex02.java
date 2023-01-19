import java.util.Scanner;

public class Lista03Ex02 {

    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha o estado atual, sr(a) usuario(a): ");
    char estadoAtual;
    estadoAtual = scanner.next().charAt(0);
    System.out.println("Escolha a sua temperatura atual, sr(a) usuario(a)");
    double temperaturaAtual = scanner.nextDouble();


    switch (estadoAtual) {
        case 'k':
            System.out.println(CalculaPraCelsius(temperaturaAtual));
            break;
        case 'c':
            System.out.println(CalculaPraKelvin(temperaturaAtual));
            break;
        default:
            System.out.println("A operação é inválida! Digite novamente.");
        }

    }

    public static double CalculaPraKelvin(double valor1) {
        double novaTemperatura = (valor1 + 273.15);
        System.out.println("Essa será a temperatura na nova escala celsius: ");
        return novaTemperatura;

    }

    public static double CalculaPraCelsius(double valor1) {
        double novaTemperatura = (valor1 - 273.15);
        System.out.println("Essa será a temperatura na nova escala kelvin : ");
        return novaTemperatura;
    }

}
