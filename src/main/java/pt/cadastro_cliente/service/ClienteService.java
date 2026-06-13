package pt.cadastro_cliente.service;

import java.util.List;
import java.util.Optional;

import pt.cadastro_cliente.model.Cliente;
import pt.uc00605_projeto_final_cliente.model.Cliente;

/**
 * Interface do serviço (regras de negócio).
 */
public interface ClienteService {

    Cliente salvar(Cliente cliente);

    List<Cliente> listarTodos();

    Optional<Cliente> buscarPorId(Long id);

    Cliente atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
