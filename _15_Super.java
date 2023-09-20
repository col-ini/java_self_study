package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    // Super
    // Super을 쓰는 이유. 부모 클래스에서 메소드를 수정하더라도 자식 클래스에서 다시 수정해줄 필요 없음. 겹치는 부분은 super.메소드명 으로 정의하기 때문.

    // Super. 을 쓰면 부모 클래스의 변수, 메소드를 호출
    // Super()을 쓰면 부모 클래스의 생성자를 호라
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-------------------");
        speedCam.takePicture();
    }
}
