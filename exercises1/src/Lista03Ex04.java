import java.util.Scanner;
public class Lista03Ex04 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome, sr(a) usuario(a): ");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Digite suas horas trabalhadas por mês, sr(a) usuario(a): ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Digite o valor de cada hora, sr(a) usuario(a): ");
        double valorHora = scanner.nextDouble();
        CalculaSalario(nomeFuncionario,horasTrabalhadas,valorHora);
    }

    public static void CalculaSalario(String nome,double horasT, double precoHora){

        System.out.printf("Valor anual recebido pelo funcionário %s%n  = %.2f %n",nome,(horasT*precoHora*13));



    }
}
