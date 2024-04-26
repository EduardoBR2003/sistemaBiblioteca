package part1;

public class MidiaAudio extends Obra{
    private String idioma;
    private String duracao;

    //Construtor
    public MidiaAudio(String genero, String autor, String titulo, int ano, String idioma, String duracao) {
        super(genero, autor, titulo, ano);
        this.idioma = idioma;
        this.duracao = duracao;
    }

    public MidiaAudio(String idioma, String duracao) {
        this.idioma = idioma;
        this.duracao = duracao;
    }

    public MidiaAudio() {

    }

    //Método de comportamento, utilizando polimorfismo
    @Override
    public void consumirObra() {
        System.out.println("Ouvir AUDIO.");
    }

    public String getIdioma() {
        return idioma;
    }

    //Métodos gets e sets
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
