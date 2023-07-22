package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 시퀀스

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전 9000원
        // 김차전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰 따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        // 작은 따옴표는 굳이 쓰지 않아도 잘 인식하지만, char 문자열 타입은 ''로 감싸야 하기 때문에 \' 쓰인다
        char c = 'A';
        //c = ''';
        c = '\'';
        System.out.println(c);
    }
}
