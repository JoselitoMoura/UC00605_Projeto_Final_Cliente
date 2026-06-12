package pt.uc00605_projeto_final_cliente.controller;

import pt.uc00605_projeto_final_cliente.model.Cliente;
import pt.uc00605_projeto_final_cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller recebe as requisições HTTP (API REST).
 */
@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // Criar cliente
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    // Listar todos
    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Optional<Cliente> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return service.atualizar(id, cliente);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
