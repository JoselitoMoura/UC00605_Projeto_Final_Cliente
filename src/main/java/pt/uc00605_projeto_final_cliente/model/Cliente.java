package pt.uc00605_projeto_final_cliente.model;

import jakarta.persistence.*;

/**
 * Classe Cliente representa a tabela no banco de dados.
 * Cada objeto desta classe será um cliente cadastrado.
 */
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do cliente
    private String nome;

    // Email do cliente
    private String email;

    // Telefone do cliente
    private String telefone;

    public Cliente() {}

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
