package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄, 문자, 숫자 사용 가능. BUT 공백은 불가능
        //3. 밑줄 또는 문자로 시작 가능 == 숫자로는 시작 X
        //4. 한 단어 또는 2개 이상 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        //6. 예약어 사용 불가 (ex) public, static, void...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "우성"; // 이름
        String lastName = "최"; // 성
        String dateOfBirth = "1999-12-30"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; //항공편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
        //String -flightNo "KE657"; // -으로 시작 안됨

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 시간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품;" //숫자로 시작 안됨

        //프로그램의 흐름을 위해 사용되는 경우 간단하게 짓는다.
        int i = 0;
        String s = "";

        // 절대 변하지 않는 상수는 대문자로, final 을 앞에 붙여주면 상수로 인식한다.
        final String CODE = "KR";

//        CODE = "US";  불가능
        System.out.println(CODE);
    }
}
