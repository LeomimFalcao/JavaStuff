import java.util.Scanner;
public class Lista03Ex03 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Insira um número inteiro positivo para descobrir seu respectivo Fatorial:");
    int numeroEscolhido = scanner.nextInt();

    if (numeroEscolhido < 0) {
        System.out.println("Não há fatorial para esse número, sr(a) usuario(a)");
    }else{

        System.out.println(EncontraFatorial(numeroEscolhido));

      }
    }

    public static int EncontraFatorial(int valor1) {
        int somatorio =1;

        for (int i = valor1; i > 1; i--) {
            somatorio *= i;
        }
        if (valor1 == 0) {
            System.out.println(valor1 + "! = " + somatorio);
        } else if (valor1 == 1){
            System.out.println(valor1 + "! = " + somatorio);
        }else{
            System.out.println("O resultado do Fatorial do número escolhido é o seguinte, sr(a) usuario(a): " + somatorio);
        }
    return somatorio;
    }
}

