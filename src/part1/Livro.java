package part1;

/*Atributos: Título, Autores, Área, Editora, Ano, Edição, Número de Folhas

Métodos: get’s e set’s*/
public class Livro extends Obra {
    private String area;
    private String editora;
    private int edicao;
    private int numFolhas;
    private Boolean emprestimo;

    //Construtor
    public Livro(String titulo, String autor, String area, String editora, String genero, int ano, int edicao, int numFolhas) {
        super(genero, autor, titulo, ano);
        this.area = area;
        this.editora = editora;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo = false;
    }

    public Livro(){
        this.emprestimo = false;
    }

    //Método de comportamento, utilizando polimorfismo
    @Override
    public void consumirObra() {
        System.out.println("Ler livro.");
    }

    //Métodos gets e sets
    public Boolean isEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(Boolean emprestimo){
        this.emprestimo = emprestimo;
    }

    public void abrirLivro(){
        System.out.println("Livro aberto para leitura.");
    }
    public void fecharLivro(){
        System.out.println("Livro fechado para leitura.");
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

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "area='" + area + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao=" + edicao +
                ", numFolhas=" + numFolhas +
                ", emprestimo=" + emprestimo +
                "} " + super.toString();
    }
}
