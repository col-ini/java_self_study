package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String reg_Number = "991230-1069312";
        System.out.println(reg_Number.substring(0, reg_Number.indexOf("-")+2));
    }
}