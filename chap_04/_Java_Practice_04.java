package chap_04;

public class _Java_Practice_04 {
    public static void main(String[] args) {
        // 반복문 문제 해결 Tip
        // 1. 복잡한 문제를 간소화하여라. Step by Step 으로 쪼개보기
        // 2. 코드 작성 시 어떠한 자리에 변수 or 상수가 들어가야하는지 파악
        // 3. 변수가 들어간다면 기존에 사용한 변수들 중 어떤 변수를 사용할 수 있는지 생각

        // 별 (*) 사각형 만들기 (상황을 쪼개서 생각하라)
        // 1. While 사용
        int i = 1;
        while (i<6) {
            System.out.println("*****");
            i += 1;
        }
        System.out.println("---------");

        // 2. For 사용
        for (i = 1; i < 6; i += 1) {
            System.out.println("*****");
        }
        System.out.println("----------");

        // 별 왼쪽 삼각형 만들기 (도대체 어떤 자리에 변수/상수가 들어가야하는지 먼저 파악하기)
        // 1. While 사용
        i = 1;
        while (i<6) {
            int j = 1;
            while (j < i+1) {
                System.out.print("*");
                j += 1 ;
            }
            System.out.println();
            i += 1;
        }
        System.out.println("----------");

        // 2. For 사용
        for (i = 1; i < 6; i += 1) {
            for (int j = 1; j < i+1; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");

        // 별 오른쪽 삼각형 만들기
        // 1. While 사용
        i = 1;
        while (i < 6) {
            int j = 1;
            while (j < 6-i) {
                System.out.print(" ");
                j += 1;
            }
            j = 1;
            while (j < i+1) {
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
        System.out.println("----------");

        // 2. For 사용
        for (i = 1; i < 6; i += 1) {
            for (int j = 1; j < 6-i; j += 1) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
