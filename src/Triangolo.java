public class Triangolo extends Forma {

    //Fields che appartengono a triangolo
    private double altezza;
    private double larghezza;

    //Costruttore
    public Triangolo(double altezza, double larghezza) {
        //richiama il costruttore della classe padre
        super(TipoForma.TRIANGOLO);
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Sovrascrittura del metodo astratto calcolaArea
    @Override
    public double calcolaArea(){
        return (altezza * larghezza) / 2;
    }
}
