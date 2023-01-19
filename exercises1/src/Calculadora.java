import java.util.Scanner;
import java.math.BigDecimal;

public class Calculadora {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação a ser realizada, sr(a) usuario(a): +, -, *, /");
        char operacao;
        operacao = scanner.next().charAt(0);
        System.out.println("Escolha o seu primeiro numero, sr(a) usuario(a)");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Escolha o seu segundo numero, sr(a) usuario(a)");
        double segundoNumero = scanner.nextDouble();

        switch (operacao) {
            case '+':
                System.out.println(FuncaoSoma(primeiroNumero, segundoNumero));
                break;
            case '-':
                System.out.println(FuncaoSubtracao(primeiroNumero, segundoNumero));
                break;
            case '*':
                System.out.println(FuncaoMutiplica(primeiroNumero, segundoNumero));
                break;
            case '/':
                if (segundoNumero == 0) {
                    System.out.println("Essa operação não está inclusa no conjunto dos reais, por favor, selecione outro denominador que não seja 0");
                } else {
                    System.out.println(FuncaoDivide(primeiroNumero, segundoNumero));
                }
                break;

            default:
                System.out.println("A operação é inválida! Digite novamente.");
        }
    }

    public static double FuncaoSoma(double valor1, double valor2) {
        double valorSoma = (valor1 + valor2);
        return valorSoma;
    }

    public static double FuncaoSubtracao(double valor1, double valor2) {
        double valorSubtracao = (valor1 - valor2);
        return valorSubtracao;
    }

    public static double FuncaoMutiplica(double valor1, double valor2) {
        double valorMultiplica = (valor1 * valor2);
        return valorMultiplica;
    }

    public static double FuncaoDivide(double valor1, double valor2) {
        double valorDivide = (valor1/valor2);
        return valorDivide;
    }

}