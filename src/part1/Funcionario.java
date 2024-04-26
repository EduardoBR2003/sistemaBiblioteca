package part1;

public class Funcionario extends Usuario {
    private String funcao;

    //Construtores
    public Funcionario(String nome, int idade, String sexo, String telefone, int id, String funcao) {
        super(nome, idade, sexo, telefone, id);
        this.funcao = funcao;
    }

    public Funcionario(){

    }

    //Métodos gets e sets
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
