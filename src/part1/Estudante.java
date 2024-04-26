package part1;

public class Estudante extends Usuario{
    private String turma;
    private int matricula;

    //Construtores
    public Estudante(String nome, int idade, String sexo, String telefone, int id, String turma, int matricula) {
        super(nome, idade, sexo, telefone, id);
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
