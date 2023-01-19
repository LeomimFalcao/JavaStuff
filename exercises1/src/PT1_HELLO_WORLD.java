import java.math.BigDecimal;
import java.util.Scanner;

public class PT1_HELLO_WORLD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do seu retangulo em metros");
        Double ladoRetangulo = scanner.nextDouble();
        System.out.println("Digite a altura do seu triangulo metros");
        Double alturaTriangulo = scanner.nextDouble();
        System.out.println("Digite a base do seu triangulo metros");
        Double baseTriangulo = scanner.nextDouble();
        System.out.println("Digite o raio do do seu circulo em metros");
        Double raioCirculo = scanner.nextDouble();
        System.out.println("Digite a base inferior do seu trapezio metros");
        Double baseInferiorTrapezio = scanner.nextDouble();
        System.out.println("Digite a base superior do seu trapezio metros");
        Double baseSuperiorTrapezio = scanner.nextDouble();
        System.out.println("Digite a altura do seu trapezio metros");
        Double alturaTrapezio = scanner.nextDouble();

        Double areaRetangulo = ladoRetangulo * ladoRetangulo;
        Double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        Double areaCirculo = Math.PI * Math.pow(raioCirculo,2);
        Double areaTrapezio = ((baseInferiorTrapezio + baseSuperiorTrapezio) * alturaTrapezio)/2;

        System.out.println("A area do seu Retangulo em metros é: "+  areaRetangulo);
        System.out.println("A area do seu Triangulo em metros é: "+  areaTriangulo);
        System.out.println("A area do seu Circulo em metros é: "+  areaRetangulo);
        System.out.println("A area do seu Trapezio em metros é: "+  areaRetangulo);


    }
}

