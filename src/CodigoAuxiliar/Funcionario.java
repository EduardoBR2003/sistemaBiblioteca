package CodigoAuxiliar;

public class Funcionario extends Usuario{
    private int id;
    private String funcao;

    public Funcionario() {

    }

    public Funcionario(String nome, String sexo, String telefone, int idade, int id, String funcao) {
        super(nome, sexo, telefone, idade);
        setId(id);
        setFuncao(funcao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
