import java.nio.charset.StandardCharsets;

public class String5 {
    public static void main(String[] args) {
        String s = "Hello, world!";
        System.out.println(s);
        String sub = s.substring(7);
        System.out.println(sub);
        System.out.println(" 中文\n\r\t".trim());
        byte[] data = "中文ABC".getBytes(StandardCharsets.UTF_8);
        System.out.println(data.toString());
        String s2 = new String(data, StandardCharsets.UTF_8);
        System.out.println(s2);
    }
}
