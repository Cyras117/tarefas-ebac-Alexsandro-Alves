import Pessoa.Pessoa;

import java.util.*;

public class main {
    public static void main(String[] args) {
        exercicioParte1();
        exercicioParte2();

    }


    public static void exercicioParte1(){
        System.out.println("\n\n##################PART1#####################\n");
        List<String> nomes = new ArrayList<>(List.of(getNomesConsole().split(",")));
        Collections.sort(nomes);
        System.out.println(nomes);
    }

    public static void exercicioParte2(){
        System.out.println("\n\n##################PART2#####################\n");
        List<Pessoa> masculino = new ArrayList<Pessoa>();
        List<Pessoa> feminino = new ArrayList<Pessoa>();

        var entrada = getNomesConsole().split(",");

        for (String p: entrada) {
            var aux = p.split("-");
            if(aux[1].equalsIgnoreCase("m")){
                masculino.add(new Pessoa(aux[0],aux[1]));
            }else {
                feminino.add(new Pessoa(aux[0], aux[1]));
            }
        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Lista M:"+masculino);
        System.out.println("Lista F:"+feminino);
    }

    public static String getNomesConsole(){
        var s = new Scanner(System.in);
        System.out.println("Informa a lista de nomes:\n");
        return s.next();
    }


}
