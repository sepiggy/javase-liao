public class IntType {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 90000000000000000L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        int i3 = 2_000_000_000;
        int i4 = 0xff0000;
        int i5 = 0b1000000000;
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        System.out.println(Integer.toHexString(12345678));

        System.out.println(Integer.toBinaryString(12345678));

    }
}
