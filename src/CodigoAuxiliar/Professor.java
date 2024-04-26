package CodigoAuxiliar;

public class Professor extends Usuario {
    private String disciplina;
    private String materia;

    public Professor() {

    }

    public Professor(String nome, String sexo, String telefone, int idade, String disciplina, String materia) {
        super(nome, sexo, telefone, idade);
        setDisciplina(disciplina);
        setMateria(materia);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
