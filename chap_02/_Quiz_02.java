package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height_limit = 120;
        int child_height = 121;
        String result = (height_limit >= child_height) ? "탑승 불가능합니다" : "탑승 가능합니다";

        System.out.println("키가 " + child_height + "cm 이므로 " + result);
    }
}
