package classes;

public class Livro extends Obra {
    private String area;
    private String editora;
    private int edicao, num_Folhas;
    private Boolean emprestimo;

    public Livro(String genero, String autor, String titulo, String area, String editora, int edicao, int num_Folhas, String ano) {
        super(genero, autor,titulo, ano);
        this.area = area;
        this.editora = editora;
        this.edicao = edicao;
        this.num_Folhas = num_Folhas;
        setEmprestimo(false);
    }

    public String abrirLivro(){
        return "classes.Livro Aberto";
    }
    public String fecharLivro(){
        return "classes.Livro fechado";
    }

    public Livro(){
        setEmprestimo(false);
    }

    public Boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNum_Folhas() {
        return num_Folhas;
    }

    public void setNum_Folhas(int num_Folhas) {
        this.num_Folhas = num_Folhas;
    }

    @Override
    public String toString() {
        return "classes.Livro{" +
                " area='" + area + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao=" + edicao +
                ", num_Folhas=" + num_Folhas +
                ", ano='" + getAno() + '\'' +
                ", emprestimo=" + emprestimo +
                "} " + super.toString();
    }
}
