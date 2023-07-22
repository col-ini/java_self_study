package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 Encapsulation (필요한 것들만, 서로 연관된 것들끼리만 하나의 캡슐에 담는다는 뜻)
        // 정보은닉 Information hiding

        // 접근 제어
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서 접근 가능. 다른 패기지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000); // 잘못 입력
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격은 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

        // 접근 제어자를 사용 (클래스에서 인스턴스 변수를 private int price 라고 설정)하면 아예 그 변수에 다른 값을 할당하는 것 자체가 오류로 뜸.
        // 따라서 Getter & Setter 을 사용해야 함.
        // b2.price = -5000;    --> 이 코드는 오류
    }
}
