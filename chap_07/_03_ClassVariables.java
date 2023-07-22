package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport); // 객체명.클래스변수
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙 박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 클래스명.클래스변수

        // 기능 개발
        // 클래스 변수는 모든 객체에 저장됨. 객체 고유의 특성이 아닌 공통의 특성을 수정해야하면 클래스 변수로 설정
        BlackBox.canAutoReport = true;

        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport); // 객체명.클래스변수
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙 박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 클래스명.클래스변수 (권장되는 방식)
    }
}
