public class Triangolo extends Forma {

    double altezza;
    double larghezza;

    public Triangolo(double altezza, double larghezza) {
        super(TipoForma.TRIANGOLO);
        this.altezza = altezza;
        this.larghezza = larghezza;

    }

    // Sovrascrittura del metodo astratto calcolaArea
    @Override
    public void calcolaArea(){
        double area = (altezza * larghezza) / 2;
        System.out.println("L'area è: " + area);
    }
}
