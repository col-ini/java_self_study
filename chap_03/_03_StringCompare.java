package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같다면 true, 다르다면 false

        // 대소문자 구분 없이 문자열 내용이 같은지 요부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용을 비교)
        System.out.println(s1 == s2); // true (참조를 비교)

        // 서로 다른 곳을 바라봄
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용은 같지만)
        System.out.println(s1 == s2); // false (참조는 다름)

        // 음식점에 화장실 비밀번호 포스트잇이 문앞에 붙어 있는 경우 모두가 참조.
        // But 일일히 비밀번호 포스트잇을 개인이 갖는다면 모두가 참조 X. 내용만 같고 참조는 다름.
        // .equals()는 내용을 비교
        // "=="는 참조를 비교
        // 그럼에도 Java에서 문자열을 비교할 때는 .equals()를 이용한다


    }
}
