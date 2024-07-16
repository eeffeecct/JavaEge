public class Ege {
    public static void main(String[] args) {
        String s = "9".repeat(100);
        while (s.contains("33333") ||  s.contains("999")) {
            if (s.contains("33333")) {
                s = s.replaceFirst("33333", "99");
            } else {
                s = s.replaceFirst("999", "3");
            }
        }
        System.out.println(s);
    }
}
