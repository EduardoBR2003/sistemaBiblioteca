package part1;

public class Estudante extends Usuario{
    private String materia;
    private int matricula;

    public Estudante() {

    }

    public Estudante(String nome, String sexo, String telefone, int idade, String materia, int matricula) {
        super(nome, sexo, telefone, idade);
        setMateria(materia);
        setMatricula(matricula);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
