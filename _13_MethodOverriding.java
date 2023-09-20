package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드오버로딩은 같은 클래스 내에서 똑같은 이름을 가진 메소드를 파라미터 수의 차이, 파라미터 타입을 다르게 함으로써 사용
        // 메소드오버라이딩은 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의 하는 것)

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedcam.showMainFeature();
    }
}
