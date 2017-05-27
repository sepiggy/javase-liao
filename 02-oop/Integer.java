// int, Integer, String的相互转换

public class Integer {
    public static void main(String[] args) {
        int i = 100;

        Integer n1 = new Integer(i);
        Integer n2 = Integer.valueOf(i);
        Integer n3 = Integer.valueOf("1234");

        int x1 = n1.intValue();
        int x2 = Integer.parseInt("1234");

        String s = n1.toString();
    }
}
