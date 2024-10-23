public class Rettangolo extends Forma{

    //variabili che appartingono a Rettangolo
    private double larghezza;
    private double altezza;

    // Costruttore per inizializzare larghezza e altezza
    public Rettangolo(double larghezza, double altezza) {
        super(TipoForma.RETTANGOLO);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    // Sovrascrittura del metodo astratto calcolaArea
    @Override
    public void calcolaArea(){
        double area = altezza * larghezza;
        System.out.println("L'area è: " + area);
    }
}
