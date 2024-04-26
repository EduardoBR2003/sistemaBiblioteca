package part1;

public class Professor extends Usuario{
    private String disciplina;
    private String materia;

    //Construtores
    public Professor(String nome, int idade, String sexo, String telefone, int id, String disciplina, String materia) {
        super(nome, idade, sexo, telefone, id);
        this.disciplina = disciplina;
        this.materia = materia;
    }

    public Professor() {

    }

    //Métodos gets e sets
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
