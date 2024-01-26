import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numero;
        Integer numeroI;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um numero:");
        numero = s.nextInt();

        numeroI = (Integer)numero;

        System.out.println("Primitivo:"+numero+"\nWrapper:"+numeroI);

    }
}
