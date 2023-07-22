package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String shoes[] = new String[10]; // int shoes[] = new int[10] 처음부터 이렇게 해도 된다.

        int shoesSize = 250;
        for (int i = 0; i < 10; i++) {
            shoes[i] = String.valueOf(shoesSize); // 자료형을 맞춰줘야한다. 문자열이 들어가는 배열.
            shoesSize += 5;
        }
        /*
        이렇게도 가능

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (5 * i);
        }
        */

        for (int i = 0; i < shoes.length; i++) {
            System.out.println("사이즈 " + shoes[i] + " (재고 있음)");
        }

        /*
        이렇게도 가능
        for (String size : shoes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
        */
    }
}