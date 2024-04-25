package part1;

public class Usuario  {

    protected String nome, sexo, telefone;
    protected int idade;

    public Usuario(){

    }
    public Usuario(String nome, String sexo, String telefone, int idade) {
        setNome(nome);
        setSexo(sexo);
        setTelefone(telefone);
        setIdade(idade);
    }

    public String lerLivro(){
        return "Lendo livro";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "part1.Usuario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
