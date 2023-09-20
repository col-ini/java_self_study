package chap_07.sports;

public class Soccer extends Sports{ // 자식 클래스
    public Soccer() {
        // this.name = "축구";
        super("축구");
    }

    // 메소드오버라이딩 + super
    public void sportsType() {
        super.sportsType();
        System.out.println("축구는 공을 가지고 11명끼리 붙는 스포츠입니다.");
    }

    public void bestSoccerPlayer() {
        System.out.println("세계 최고의 축구선수는 단언컨데 리오넬 메시입니다.");
    }
}
