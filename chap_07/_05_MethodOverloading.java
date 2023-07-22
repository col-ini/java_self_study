package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        System.out.println("-----------------------");
        b1.record(true, false, 3);
        System.out.println("-----------------------");
        b1.record();

        //String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));

        // 메소드 오버로딩은 1. 입력값의 개수가 다르거나  2. 입력값의 자료형이 다르면 가능. 단, 리턴값의 자료형이 다르면 안됨.
        // 상당히 자주 쓰인다.
    }
}
