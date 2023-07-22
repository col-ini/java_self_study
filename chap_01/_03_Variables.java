package chap_01;

/*핵심은 쓰려는 자료의 크기에 적합한 형태를 불러오는 것. 작은 데이터를 위해 큰 형태 or 큰 데이터에 작은 형태 할당 방지*/

public class _03_Variables {
    public static void main(String[] args) {

        String name = "최우성";
        int hour = 15;

        System.out.println(name + "님, " + hour + "시에 배송이 시작됩니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score =  90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        /* 긴 소숫점을 쓸 때에는 double이 float 보다 적합하다 */
        double d =3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        /*int는 +-21억까지만 담을 수 있다. 넘게 되면 long을 사용 */
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
