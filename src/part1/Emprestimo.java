package part1;
/*Atributos: Data do Empréstimo, Hora do Empréstimo, Livro(Relacionamento) e

Usuário (Relacionamento)
Métodos: get’s e set’s*/
public class Emprestimo {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livro livro;
    private Usuario usuario;

    //Construtores
    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }
    public Emprestimo(){

    }

    public void devolverLivro(){
        livro.setEmprestimo(true);
        System.out.println("Livro devolvido.");
    }

    //Métodos gets e sets
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo='" + dataEmprestimo + '\'' +
                ", horaEmprestimo='" + horaEmprestimo + '\'' +
                ", livro=" + livro.getTitulo() +
                ", usuario=" + usuario.getNome() +
                '}';
    }
}
