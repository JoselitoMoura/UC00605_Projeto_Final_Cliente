package pt.cadastro_cliente.repository;

import pt.cadastro_cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository é responsável por comunicar com o banco de dados.
 * Aqui não precisamos escrever SQL.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
