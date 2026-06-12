package pt.uc00605_projeto_final_cliente.repository;

import pt.uc00605_projeto_final_cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository é responsável por comunicar com o banco de dados.
 * Aqui não precisamos escrever SQL.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
