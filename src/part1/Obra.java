package part1;

public class Obra {
    private String titulo;
    private String genero;
    private String autor;
    private String ano;

    public Obra(String genero, String autor, String titulo, String ano) {
        setGenero(genero);
        setAutor(autor);
        setTitulo(titulo);
        setAno(ano);
    }

    public Obra() {
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "part1.Obra{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
