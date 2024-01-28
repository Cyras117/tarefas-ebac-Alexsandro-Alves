package Pessoas;


public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String genero;

    public Pessoa(String nome, String genero){

        this.nome = nome;
        this.genero = genero;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome+"("+genero+")";
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Pessoa p) {
        return this.getNome().compareTo(p.getNome());
    }
}
