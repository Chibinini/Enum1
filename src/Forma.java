public abstract class Forma {

    protected TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public abstract void calcolaArea();

    public void stampaTipo() {
        System.out.println("La forma geometrica è il : " + tipo);
    }
}
