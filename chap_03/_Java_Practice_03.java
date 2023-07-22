package chap_03;

public class _Java_Practice_03 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s);
        System.out.println(s.length());
        int s_length = s.length();

        System.out.println(s.substring(0, s_length));
        System.out.println(s.substring(s.indexOf("and")));
        System.out.println(s.substring(s.lastIndexOf("and"), s_length));
    }
}
