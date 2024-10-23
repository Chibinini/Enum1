public class Rettangolo extends Forma{

    //Fields che appartengono a Rettangolo
    private double larghezza;
    private double altezza;

    // Costruttore per inizializzare larghezza e altezza
    public Rettangolo(double larghezza, double altezza) {
        //Richiama il costruttore della classe padre
        super(TipoForma.RETTANGOLO);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    // Sovrascrittura del metodo astratto calcolaArea
    @Override
    public double calcolaArea(){
            return (altezza * larghezza) / 2;
        }
    }

