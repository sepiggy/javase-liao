public class MathRandom {
    public static void main(String[] args) {
        long MIN = 1000;
        long MAX = 9000;
        double x = Math.random() * (MAX - MIN) + MIN;
        System.out.println(x);
        double r = (long) x;
        System.out.println(r);
    }
}

