package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드 오버로딩 (이름이 같은 메소드 여러개 만들기)
        // 1. 전달인자의 자료형(String, Int, Double,,,)이 다르거나
        // 2. 전달인자의 갯수가 다르면
        // 사용가능
        // 단, 반환값의 자료형이 다르면 안됨유!!!!!!!!!!!

        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
