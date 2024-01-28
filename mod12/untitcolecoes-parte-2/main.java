import Pessoas.Pessoa;

import java.util.*;

public class main {
    public static void main(String[] args) {
        var listaGeral = getNomesConsole().split(",");
        var listaMasculino = main.separaGenero(listaGeral,"m");
        var listaFeminino = main.separaGenero(listaGeral,"f");
        Map<String,List<Pessoa>> listagem = new HashMap<>();
        listagem.put("m",listaMasculino);
        listagem.put("f",listaFeminino);

        System.out.println(listagem);
    }

    public static String getNomesConsole(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informa a lista de nomes e generos:\n");
        return s.next();
    }

    public static List<Pessoa> separaGenero(String[] p, String gen){
        List<Pessoa> listaRetorno = new ArrayList<Pessoa>();
        for (String pessoa:p){
            var aux = pessoa.split("-");
            if (aux[1].equalsIgnoreCase(gen)){
                listaRetorno.add(new Pessoa(aux[0],aux[1]));
            }
        }
        return listaRetorno;
    }
}

