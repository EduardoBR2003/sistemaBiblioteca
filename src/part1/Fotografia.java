package part1;

public class Fotografia extends Obra{
    private String tipoFotografia;

    //Construtor
    public Fotografia(String genero, String autor, String titulo, int ano, String tipoFotografia) {
        super(genero, autor, titulo, ano);
        this.tipoFotografia = tipoFotografia;
    }

    public Fotografia(){

    }

    //Método de comportamento, utilizando polimorfismo
    @Override
    public void consumirObra() {
        System.out.println("Visualizar FOTOGRAFIA.");
    }

    //Métodos gets e sets
    public Fotografia(String tipoFotografia) {
        this.tipoFotografia = tipoFotografia;
    }

    public String getTipoFotografia() {
        return tipoFotografia;
    }

    public void setTipoFotografia(String tipoFotografia) {
        this.tipoFotografia = tipoFotografia;
    }
}
