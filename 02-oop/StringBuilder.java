public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        String s = sb.append("Mr ").append("Jia").append("!").insert(0, "Hello, ").toString();
        System.out.println(s);
    }
}
