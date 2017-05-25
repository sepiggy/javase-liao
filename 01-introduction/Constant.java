public class Constant {
    public static void main(String[] args) {
        final double PI = 3.14;
        double r = 4.0;
        double length = PI * r * 2;
        double area = PI * r * r;
        System.out.println(length);
        System.out.println(area);

        // magic number;
        final double TAX_RATE = 0.2;
        double salary = 12500.0;
        double pay = salary * (1 - TAX_RATE);
        System.out.println(pay);
    }
}
