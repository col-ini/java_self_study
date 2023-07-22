package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        // For 문에는 자동으로 변수 설정, 변수 늘리기를 하지만
        // While 문에는 직접 변수 설정, 변수 늘리기 작업을 해줘야 함

        // For 문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문을 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-------------");

        // While 문
        int index = 1; // 손님 대기 번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index += 1;
        }
        System.out.println("영업을 종료합니다.");
    }
}
