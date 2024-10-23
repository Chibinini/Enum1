public class Main {
    public static void main(String[] args) {

        Forma triangolo = new Triangolo(15,10);
        System.out.println("L'area è :" + triangolo.calcolaArea());
        triangolo.stampaTipo();

        Forma rettangolo = new Rettangolo(45,10);
        System.out.println("L'area è :" + rettangolo.calcolaArea());
        rettangolo.stampaTipo();
    }
}