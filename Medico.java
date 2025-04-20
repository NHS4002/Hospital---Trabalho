package Hospital;

public class Medico extends Usuario {
    String especialidade;
    Medico(String nome, String cpf, String senha, String especialidade) {
        super(nome, cpf, senha);
        this.especialidade = especialidade;
    }
}