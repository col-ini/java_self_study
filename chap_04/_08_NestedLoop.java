package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 반복문 문제 해결 Tip
        // 1. 복잡한 문제를 간소화하여라. Step by Step 으로 쪼개보기
        // 2. 코드 작성 시 어떠한 자리에 변수 or 상수가 들어가야하는지 파악
        // 3. 변수가 들어간다면 기존에 사용한 변수들 중 어떤 변수를 사용할 수 있는지 생각

        // 별 (*) 사각형 만들기 (상황을 쪼개서 생각하라)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------");

        // 별 왼쪽 삼각형 만들기 (도대체 어떤 자리에 변수/상수가 들어가야하는지 먼저 파악하기)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------");

        // 별 오른쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
