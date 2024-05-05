package Pessoas;

public class PessoaFisica extends Pessoa{
    String cpf;
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome +"("+"idade: " + idade +", cpf: " + cpf + ")";
    }
}
