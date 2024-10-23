public class Main {
    public static void main(String[] args) {

        Forma triangolo = new Triangolo(15,10);
        triangolo.calcolaArea();
        triangolo.stampaTipo();

        Forma rettangolo = new Rettangolo(45,10);
        rettangolo.calcolaArea();
        rettangolo.stampaTipo();
    }
}