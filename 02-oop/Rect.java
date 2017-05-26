class Rect implements Shape {
    private final double width;
    private final double height;

    public Rect(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    public double area() {
        return width * height;
    }
}
