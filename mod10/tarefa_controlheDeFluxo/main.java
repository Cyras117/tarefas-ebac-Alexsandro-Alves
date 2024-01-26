import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean repetir = true;
        float nota1,nota2,nota3,nota4;

        do{
            nota1 = getNota();
            nota2 = getNota();
            nota3 = getNota();
            nota4 = getNota();

            System.out.println("Situação:"+getAprovado(nota1,nota2,nota3,nota4));

            repetir = getRepetir();

        }while (repetir);

    }

    public static Boolean getRepetir(){
        var s = new Scanner(System.in);
        String resposta;

        System.out.println("\nDeseja Verificar a situação de outro aluno?");
        resposta = s.next();
        if (resposta.equalsIgnoreCase("sim")  || resposta.equalsIgnoreCase("s") ){
            return true;
        }
        System.out.println("Obrigado!!");
        return  false;
    }
    public static float getNota(){
        float nota;
        var s = new Scanner(System.in);
        System.out.println("\nInforme a nota:");
        nota = s.nextFloat();
        return nota;
    }
    public static String getAprovado(float n1,float n2,float n3,float n4){
        float media = (n1+n2+n3+n4)/4;
        if(media >= 7){
            return "Aprovado";
        } else if (media >=5) {
            return "Recuperação";
        }else {
            return "Reprovado";
        }
    }
}
