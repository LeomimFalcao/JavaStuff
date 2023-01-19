import java.util.Random;
import java.util.Scanner;
public class QuadradoPerfeito {

    //usei long só por precaução e dar margem caso queiram alterar o bound pra milhão e estourar o numero de bits e evitar overflow na variavel.
    public static void main(String[] args) {
        int[][] matriz = montarEPreencherQuadrado();
        int n = matriz.length;
        System.out.println("Matriz Recebida,Sr(a) Usuario(a)");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        long[] somalinha = somal(matriz, n);
        System.out.print("Soma de cada linha = ");
        for(int i = 0; i < n; i++){
            System.out.print(somalinha[i]+ " ");
        }
        System.out.println();
        long[] somacoluna = somac(matriz, n);
        System.out.print("Soma de cada coluna = ");
        for(int i = 0; i < n; i++){
            System.out.print(somacoluna[i]+ " ");
        }
        System.out.println();
        long somadiagonalP = somadp(matriz, n);
        System.out.println("Soma Diagonal Principal = "+ somadiagonalP);
        long somadiagonaS = somads(matriz, n);
        System.out.println("Soma Diagonal Secundaria  = " + somadiagonaS);
        boolean f1 = true;
        for(int i = 0; i < n-1;i++){
            if(somalinha[i] != somalinha[i+1]){
                f1 = false;
                break;
            }
        }
        boolean f2 = true;
        for(int i = 0; i < n-1;i++){
            if(somacoluna[i] != somacoluna[i+1]){
                f2 = false;
                break;
            }
        }
        boolean f3 = somadiagonaS == somadiagonalP;
        if(f1 && f2 && f3 && somalinha[0]==somacoluna[0]){

            System.out.println("É um quadrado perfeito, Sr(a) Usuário(a)");
        }
        else{
            System.out.println("Não é um quadrado perfeito, Sr(a) Usuário(a)");
        }
    }

    public static long[] somal(int[][] matriz, int n){
        long soma = 0;
        long[] somavetor = new long[n];
        for(int i = 0;i < n;i++){
            soma = 0;
            for(int j = 0; j < n;j++){
                soma += matriz[i][j];
            }
            somavetor[i]=soma;
        }
        return somavetor;
    }
    public static long[] somac(int[][] matriz, int n){
        long soma = 0;
        long[] somavetor = new long[n];
        for(int j = 0;j < n;j++){
            soma = 0;
            for(int i = 0; i < n;i++){
                soma += matriz[i][j];
            }
            somavetor[j]=soma;
        }
        return somavetor;
    }
    public static long somadp(int[][] matriz, int n){
        long soma = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                if(i == j){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static long somads(int[][] matriz, int n){
        long soma = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n;j++){
                if(i + j + 1 == n){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
    public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado, sr(a) usuario(a):");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(0, 1000);
                //colunas[coluna] = 1; Para que se force a condição de quadrado perfeito, basta descomentar essa linha e comentar a debaixo.
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + colunas[coluna] + "]");
            }
            System.out.println();
        }
        return matriz;
    }

}
