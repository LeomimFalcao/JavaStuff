
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer numRevive = 1;
        Boolean estaVivo = false;


    }

    public void useRevive(Integer numRevive) {


        Scanner scanner = new Scanner(System.in);

        while (numRevive > 0 && estaVivo == false) {
            System.out.println("Deseja usar seu Revive ? Responda com S ou N !");
            char resposta = scanner.next().charAt(0);
            if (resposta == 'S'){
                vida = ((3 / 4) * vidaPadrão);
                numRevive--;
                System.out.println("o pokemon foi revivido e sua vida atual é: " + vida);
            }else{

            }

        }
    }
}