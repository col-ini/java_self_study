package chap_07.sports;

public class Sports { //부모 클래스

    public String name;

    public Sports() {
        this.name = "스포츠";
    }

    //메소드오버로딩
    protected Sports(String name) {
        this.name = name;
    }

    public void sportsType() {
        System.out.println("스포츠는 기본적으로 공을 가지고 하는 운동입니다.");
    }
}
