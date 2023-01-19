import java.util.Scanner;
public class DiagonalSecundaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do array desejado, Sr(a) Usuário(a):");
        int tamanho = scanner.nextInt();
        int[] lista = new int[tamanho];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = scanner.nextInt();
        }
        System.out.println("A lista ficou organizada da seguinte forma: ");
        for(int j = 0; j < lista.length;j++){
            System.out.print(lista[j]);
        }
    }

}