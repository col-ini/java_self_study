package chap_06;
// 변수가 선언된 각각의 중괄호 속에서만 사용가능. 벗어나는 순간 사용 불가
public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3;

//        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);
    }
}
