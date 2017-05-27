import java.nio.charset.StandardCharsets;

public class String4 {
    public static void main(String[] args) throws Exception {
        String s = "hello";
        byte[] bs1 = s.getBytes("UTF-8");
        byte[] bs2 = s.getBytes(StandardCharsets.UTF_8);

        new String(bs1, "UTF-8");
        new String(bs2, StandardCharsets.UTF_8);
    }
}
