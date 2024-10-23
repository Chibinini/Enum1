public abstract class Forma {

    //variabile che serve a memorizzare il tipo di forma specificato
    protected TipoForma tipo;

   //costruttore
    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    //metodo vuoto da implementare nelle classi figlie
    public abstract double calcolaArea();

    //metodo che stampa solo il tipo di forma
    public void stampaTipo() {
        System.out.println("La forma geometrica è il : " + tipo);
    }
}
