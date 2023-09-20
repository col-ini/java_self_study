package chap_07;

import chap_07.sports.Baseball;
import chap_07.sports.Soccer;
import chap_07.sports.Sports;

public class sportsPractice {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Sports soccer = new Soccer();       //Soccer soccer = new Soccer();
        Sports baseball = new Baseball();   //Baseball baseball = new Baseball();

        Sports[] sport = {sports, soccer, baseball};

        // 다형성
        for (Sports Sport : sport) {
            System.out.println(Sport.name);
        }

        System.out.println("---------------");

        System.out.printf("이 클래스의 대표명은 %s입니다.\n", sports.name);
        System.out.printf("이 클래스의 대표명은 %s입니다.\n", soccer.name);
        System.out.printf("이 클래스의 대표명은 %s입니다.\n", baseball.name);

        System.out.println("---------------");

        sports.sportsType();
        soccer.sportsType();
        baseball.sportsType();

        System.out.println("----------------");

        //soccer 와 baseball은 Sports 클래스로부터 불러왔기 때문에, 각각의 클래스에 있는 고유한 변수, 메소드는 못 가져온다.
        //soccer.bestSoccerPlayer();
        //baseball.bestBaseballPlayer();

        if (soccer instanceof Soccer) {
            ((Soccer) soccer).bestSoccerPlayer();
        }

        if (baseball instanceof Baseball) {
            ((Baseball) baseball).bestBaseballPlayer();
        }
    }
}
