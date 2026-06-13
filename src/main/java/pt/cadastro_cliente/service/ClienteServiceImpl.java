package pt.cadastro_cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.cadastro_cliente.model.Cliente;
import pt.cadastro_cliente.repository.ClienteRepository;

// Implementação do service, aqui ficam as regras de negócio.

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        existente.setNome(cliente.getNome());
        existente.setEmail(cliente.getEmail());
        existente.setTelefone(cliente.getTelefone());

        return repository.save(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
