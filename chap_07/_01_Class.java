package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성
        // 클래스는 설명서, 설계도가 들어가있는 종이접기 책, 객체는 종이학(다양한 종이학 결과물 가능)

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상정보

        // 우리가 만든 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000; // 가격은 정수이기 때문에 같은 문자열만 담을 수 있는 배열을 사용 불가
        String color = "블랙";

        // 새로운 제품 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        BlackBox bbox = new BlackBox(); // BlackBox 라는 클래스로부터 bbox 라는 객체를 생성
        // BlackBox 클래스로부터 bbox 객체를 생성
        // bbox 객체는 BlackBoc 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();
    }
}
