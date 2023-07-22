package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {

        // Getter & Setter 을 굳이 이용하는 이유는 객체에서 인스턴스 변수를 직접 설정할 때 값을 잘못 입력하거나, 누락될 수 있기에 클래스 부분에서 안전장치로 설정할 수 있기 때문.

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -5000; // 잘못 입력
        System.out.println("가격 : " + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격은 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

        // 그렇지만 객체 내에서 어쨌든 잘못 수정하는 일이 발생하기도 함.
        // 이 문제점을 끝까지 막기 위해서 _10_AccessModifier (접근 제어자)를 배움.
        // b2.price = -5000;
    }
}
