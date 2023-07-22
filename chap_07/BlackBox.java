package chap_07;

public class BlackBox {
    // main method 필요 없다.

    // BlackBox(클래스) 라는 설계도. 객체마다 다른 값을 가질 수 있음

    // 인스턴스 변수
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    // 클래스 변수
    // 클래스 변수는 모든 객체에 저장됨. 객체 고유의 특성이 아닌 공통의 특성을 수정해야하면 클래스 변수로 설정
    static boolean canAutoReport = false; // 자동 신고 기능

    static int counter = 0; // 시리얼 번호를 생성해주는 역할(처음엔 0이었다가 ++ 연산을 통해서 값을 증가. 1, 2)

    // Constructor(실행자)
    // 보통 인스턴스 변수 밑에 만듦.
    // 실행자도 오버로딩이 가능.

    // 주석처리한 이유는 Getter & Setter 부분 때문.

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 동일한 이름을 지닌 constructor()을 실행한다. 따라서 여기선 BlackBox()를 실행. // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


    // 메소드

    // 입력값도 리턴값도 없음
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    // 입력값은 있고 리턴값은 없음
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // 입력값도 있고 리턴값도 있음
    int getVideoFileCount (int type) {
        if (type == 1) { // 일반 영상
            return 9;
    }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // 인스턴스 변수, 메소드를 호출할 때 "객체명.변수명", 객체명.메소드명" 으로 호출     ex) b1.modelName
    // 클래스 변수를 호출할 때 "클래스명.클래스변수명" 으로 호출    ex) BlackBox.canAutoReport


    // 메소드 오버로딩
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    // 메소드 오버로딩. 만약 위의 메소드처럼 입력값을 입력하지 않는다면, 직접 메소드를 다시 호출해서 입력값을 미리 지정.
    void record() {
        record(true, true, 5);
    }

    // 클래스 메소드
    // 클래스 메소드, 클래스 인스턴스는 객체(b1, b2...)가 만들어지지 않아도 클래스명.클래스메소드 이렇게 사용가능
    // 클래스 메소드 안에서는 클래스 변수만 사용가능하며 인스턴스 변수는 사용 불가능하다
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결됩니다.");
        // modelName = test;            --> 오류. modelName은 인스턴스 변수이기 때문.
        // canAutoReport = false;       --> 작동. canAutoReport은 클래스 변수이기 때문.
    }

    // this를 쓰면 클래스 내의 인스턴스 변수를 사용가능.
    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter(값을 가져옴) & Setter(값을 설정함)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
