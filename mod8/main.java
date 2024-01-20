import media.Media;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int nota1= 0,nota2= 0,nota3= 0,nota4= 0;
        Scanner resposta = new Scanner(System.in);
        Media m = new Media();

        System.out.println("Informe a primeira nota");
        nota1 = resposta.nextInt();

        System.out.println("Informe a segunda nota");
        nota2 = resposta.nextInt();

        System.out.println("Informe a terceira nota");
        nota3 = resposta.nextInt();

        System.out.println("Informe a quarta nota");
        nota4 = resposta.nextInt();

        m.calculaMedia(nota1,nota2,nota3,nota4);

    }
}
