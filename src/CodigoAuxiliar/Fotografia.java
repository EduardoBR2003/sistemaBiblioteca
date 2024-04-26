package CodigoAuxiliar;

public class Fotografia extends Obra {

    public Fotografia(){

    }
    public Fotografia(String genero, String autor, String ano, String titulo) {
        super(genero, autor,titulo, ano);
        setAno(ano);
    }
}
