package sample;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle();

        tr1.setSideA(2.0);
        tr1.setSideB(3.0);
        tr1.setSideC(3.0);

        double sqr = tr1.triangleSquare();

        Triangle tr2 = new Triangle();

        tr2.setSideA(4.0);
        tr2.setSideB(7.2);
        tr2.setSideC(5.4);

        double sqr2 = tr2.triangleSquare();

        System.out.println(sqr);
        System.out.println(sqr2);
    }
}
