import Pessoas.*;
public class mod13Runner {
    public static void main(String[] args) {
        Pessoa pf = CriarPessoaFisica("Pessoa","123654",26,"987456");
        Pessoa pj = CriarPessoaJuridica("Aossep","456321",30,"654789");

        System.out.println("Pessoa Fisica:"+pf+"\n\nPessoa Juridica:"+pj);
    }

    public static PessoaFisica CriarPessoaFisica(String nome, String rg, int idade, String cpf){
        var p = new PessoaFisica();
        p.setNome(nome);
        p.setCpf(cpf);
        p.setRg(rg);
        p.setIdade(idade);

        return p;
    }
    public static PessoaJuridica CriarPessoaJuridica(String nome, String rg, int idade, String cnpj){
        var p = new PessoaJuridica();
        p.setNome(nome);
        p.setCnpj(cnpj);
        p.setRg(rg);
        p.setIdade(idade);

        return p;
    }

}
