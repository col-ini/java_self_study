package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        // 메소드 내에서도 또다른 메소드 호출 가능.
        // 어떤 수의 제곱만 구하고 싶으면 이 메소드, 그 이상을 구하고 싶으면 전달인자 추가.
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2));

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3));

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2));
        System.out.println(getPower(4));

    }
}