package InciandoNoSpring.PrimeiraAplicacao.Model;

import jakarta.persistence.*;

@Entity
@Table (name = "cadastro")
public class M_Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cadastro", unique = true)
    private Long id_cadastro;
    private String nome;
    private String usuario;
    private String senha;
    private String endereco;

    public Long getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(Long id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
