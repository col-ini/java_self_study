package chap_01;

public class _Java_Practice_01 {
    public static void main(String[] args) {
        // 1. 정수를 실수로
        // 2. 실수를 정수로
        // 3. 정수(실수)를 문자열로
        // 4. 문자열을 정수(실수)로

        // 1. 정수를 실수로
        int numInt_1 = 10 ;
        System.out.println((double)numInt_1);

        double numDouble_1 = numInt_1 ;
        System.out.println(numDouble_1);

        // 2. 실수를 정수로
        double numDouble_2 = 10.0 ;
        float numFloat_2 = 10.0F ;
        System.out.println((int)numDouble_2);
        System.out.println((int)numFloat_2);

        int numInt_2 = (int)numDouble_2;
        System.out.println(numInt_2);

        // 3. 정수(실수)를 문자열로
        int numInt_3 = 10;
        double numFloat_3 = 10.0;
        String numString_3 = String.valueOf(numInt_3);
        System.out.println(numString_3 + numString_3.getClass());
        System.out.println(Integer.toString(numInt_3) + Integer.toString(numInt_3).getClass());

        // 4. 문자열을 정수(실수)로
        String numString_4 = "10";
        int numInt_4 = Integer.parseInt(numString_4);
        System.out.println(numInt_4 + numInt_4);
        double numDouble_4 = Double.parseDouble(numString_4);
        System.out.println(numDouble_4);

    }
}
