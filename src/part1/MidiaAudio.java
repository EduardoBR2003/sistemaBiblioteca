package part1;

public class MidiaAudio extends Obra {
    private String tipoLinguagem;
    private int duracao;

    public MidiaAudio(){

    }

    public MidiaAudio(String genero, String autor, String titulo, String tipoLinguagem, int duracao,String ano) {
        super(genero, autor, titulo, ano);
        this.tipoLinguagem = tipoLinguagem;
        this.duracao = duracao;
    }

    public MidiaAudio(String tipoLinguagem, int duracao) {
        this.tipoLinguagem = tipoLinguagem;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTipoLinguagem() {
        return tipoLinguagem;
    }

    public void setTipoLinguagem(String tipoLinguagem) {
        this.tipoLinguagem = tipoLinguagem;
    }
}
