package DAO;

import Domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClienteDAO{

    private final Map<Long,Cliente> map;


    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(),cliente);
        return true;
    }

    @Override
    public Boolean excluir(Long cpf) {
        Cliente c = this.map.get(cpf);
        if(c != null){
            this.map.remove(c.getCpf());
            return true;
        }
        return false;
    }

    @Override
    public Boolean alterar(Cliente cliente) {
        Cliente c = this.map.get(cliente.getCpf());
        if(c == null){
            return  false;
        }
        c.setNome(cliente.getNome());
        c.setTel(cliente.getTel());

        c.setEnd(cliente.getEnd());
        c.setNumero(cliente.getNumero());
        c.setCidade(cliente.getCidade());
        c.setEstado(cliente.getEstado());

        return true;
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
