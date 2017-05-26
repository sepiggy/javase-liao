public interface Shape {
    double area();

    // double perimeter();
    default double perimeter() {
        return 0;
    }

}
