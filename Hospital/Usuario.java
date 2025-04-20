package Hospital;

public class Usuario {
    String nome;
    String cpf;
    String senha;

    Usuario(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}