package Pessoas;

public class PessoaJuridica extends Pessoa{
    String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nome+"("+"idade: "+idade+" cnpj: "+cnpj+")";
    }
}
