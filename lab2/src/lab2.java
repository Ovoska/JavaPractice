import java.lang.Math;

public class lab2 {
    public static void main(String[] args) {

        double a1 = 2.54;
        double b1 = 1.23;
        double c1 = -2.14;
        double d1 = 0.23;

        double result5 = 2 * Math.cos(Math.pow(a1, b1)) + Math.acos(Math.max(-1, Math.min(1, c1 / Math.sqrt(d1))));
        System.out.println("Результат №5: " + result5);


        double a2 = 1.25;
        double b2 = 3.09;
        double c2 = 4.25;
        double d2 = 0.56;

        double result15 = 2 - Math.log10(a2) / Math.sqrt(Math.acos(Math.max(-1, Math.min(1, b2)))) - 3 * Math.sqrt(Math.exp(-a2) * Math.sinh(d2));
        System.out.println("Результат №15: " + result15);


        double a3 = 2.98;
        double b3 = 5.55;
        double c3 = 0.045;
        double d3 = 0.129;

        double result25 = Math.pow(a3, b3) / Math.cosh(Math.abs(b3)) + 4 * Math.log10(c3 / Math.sqrt(d3));
        System.out.println("Результат №25: " + result25);
    }
}
