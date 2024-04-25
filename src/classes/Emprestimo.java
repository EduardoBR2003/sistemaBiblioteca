package classes;

public class Emprestimo {
    private String data_Emprestimo;
    private int horas;
    private Livro livro;
    private Usuario user;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void devolverLivro(){
        livro.setEmprestimo(true);
        System.out.println("classes.Livro DEVOLVIDO!!!");
    }

    public String getData_Emprestimo() {
        return data_Emprestimo;
    }

    public void setDataEmprestimo(String data_Emprestimo) {
        this.data_Emprestimo = data_Emprestimo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "classes.Emprestimo{" +
                "data_Emprestimo=" + data_Emprestimo +
                ", horas=" + horas +
                ", livro=" + livro +
                ", user=" + user +
                '}';
    }
}
