package DAO;

import Domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public Boolean excluir(Long cpf);
    public Boolean alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
