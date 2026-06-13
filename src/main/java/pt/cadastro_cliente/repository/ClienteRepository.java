package pt.cadastro_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.cadastro_cliente.model.Cliente;

//Repository é responsável por comunicar com o banco de dados.
 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}