public class Interface {

    public static void main(String[] args) {
        Shape s1 = new Rect(200, 100);
        Shape s2 = new Circle(60);

        System.out.println(s1.area());
        System.out.println(s2.area());

        System.out.println(s1.perimeter());
        System.out.println(s2.perimeter());
    }

}
