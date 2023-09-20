package chap_07.sports;

public class Baseball extends Sports{
    public Baseball() {
        // this.name = "농구";
        super("농구");
    }

    //메소드오버라이딩 + super
    public void sportsType() {
        super.sportsType();
        System.out.println("농구는 공을 가지고 6명끼리 붙는 스포츠입니다.");
    }

    public void bestBaseballPlayer() {
        System.out.println("세계 최고의 농구선수는 단언컨데 마이클 조던입니다.");
    }
}
