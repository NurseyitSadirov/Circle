public class Circle {
    private static int Pi;

    public static int area(int radius) {
        return Pi * (radius * radius);
    }

    public static int circumference(int radius) {
        return Pi * 2 * radius;
    }

    public static int getPi() {
        return Pi;
    }

    public static void setPi(int pi) {
        Pi = pi;
    }

}
