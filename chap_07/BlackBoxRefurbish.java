package chap_07;

public class BlackBoxRefurbish {
    public String modelName;
    String resolution; // 접근 제어자를 아무것도 적지 않으면 default
    private int price;
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// 클래스도 변수, 메소드와 동일하게 접근 제어자를 사용 가능(public, private, default, protected)
// 한 개의 클래스 안에 여러개의 클래스 설정 가능. 단, public을 사용 시 파일명과 이름이 동일해야 한다.