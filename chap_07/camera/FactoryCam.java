package chap_07.camera;

public class FactoryCam extends Camera { // 하나의 부모로부터만 상속 받을 수 있다.

    public FactoryCam() { // 자식 클래스
        this.name = "공장 카메라";
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
}
