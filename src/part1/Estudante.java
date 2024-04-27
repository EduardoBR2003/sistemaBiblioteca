package part1;

public class Estudante extends Usuario{
    private String turma;
    private String matricula;

    //Construtores
    public Estudante(String nome, int idade, String sexo, String telefone, String turma, String matricula) {
        super(nome, idade, sexo, telefone);
        this.turma = turma;
        this.matricula = matricula;
    }

    public Estudante() {

    }

    //Métodos gets e sets
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
