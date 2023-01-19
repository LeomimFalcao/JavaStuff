import java.util.Scanner;

public class Lista03Ex05 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dê entrada no tempo gasto na viagem, sr(a) usuario(a)");
        double tempoGasto = scanner.nextDouble();
        System.out.println("Dê entrada na velocidade média em km/h, sr(a) usuario(a)");
        double velocidadeMedia = scanner.nextDouble();
        CalcularDistanciasELitros(tempoGasto,velocidadeMedia);


    }

public static void CalcularDistanciasELitros(double tempo,double velocidade){

        double distanciaPercorrida = (tempo * velocidade);
        double litrosGastos = (distanciaPercorrida/12);

        System.out.printf("A distância percorrida nessa viagem foi a seguinte: %.3f%n", distanciaPercorrida);
    System.out.printf("A quantidade de litros gastos nessa viagem foi a seguinte: %.3f%n", litrosGastos);


}
}
