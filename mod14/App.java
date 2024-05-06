import DAO.ClientMapDAO;
import Domain.Cliente;

import javax.swing.*;
import java.util.regex.Pattern;

public class App {
    private static ClientMapDAO cmap;

    public static void main(String[] args) {
        cmap = new ClientMapDAO();
        String opcao;


        do{
            do{
                opcao = JOptionPane.showInputDialog(null,
                        "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para excluir, 4 para alteração ou 5 para sair",
                        "Green dinner", JOptionPane.INFORMATION_MESSAGE);
            }while (!isOpcaoValida(opcao));

            switch (opcao){
                case "1"->{
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);
                }
                case "2"->{
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite o cpf",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);
                    if(!isDadosValidos(dados)){
                        JOptionPane.showMessageDialog(null, "Dados informados são invalidos!!!", "Info",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        consultar(dados);
                    }

                }
                case "3"->{
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente",
                            "Excluir cliente", JOptionPane.INFORMATION_MESSAGE);
                    excluir(dados);
                }
                case "4"->{
                    String dados = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Atualização", JOptionPane.INFORMATION_MESSAGE);
                    atualizar(dados);
                }
                case "5"->{
                    sair();
                }
            }
        }while (isOpcaoValida(opcao));

    }
    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }
    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo O/ ", "Sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        if (dadosSeparados.length != 7){
            JOptionPane.showMessageDialog(null, "Dados informados são invalidos!!!", "Info",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Cliente cliente = new Cliente(dadosSeparados[0],Long.valueOf(dadosSeparados[1]),Long.valueOf(dadosSeparados[2]),dadosSeparados[3],Integer.valueOf(dadosSeparados[4]),dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = cmap.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void consultar(String dados) {
        Cliente cliente = cmap.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static Boolean isDadosValidos(String dados){
        return Pattern.matches("^[0-9]+$",dados);
    }
    private static void excluir(String dados) {
        cmap.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }
    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],Long.valueOf(dadosSeparados[1]),Long.valueOf(dadosSeparados[2]),dadosSeparados[3],Integer.valueOf(dadosSeparados[4]),dadosSeparados[5],dadosSeparados[6]);
        cmap.alterar(cliente);
    }
}

