package part1;
/*Atributos: Nome, Idade, Sexo, Telefone

Métodos: get’s e set’s*/
public class Usuario {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    //Construtores
    public Usuario(String nome, int idade, String sexo, String telefone, int id) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.id = id;
    }
    public Usuario(){

    }

    //Métodos gets e sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void lerLivro(){
        System.out.println("O usuário está lendo o livro.");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
