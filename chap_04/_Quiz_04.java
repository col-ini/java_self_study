package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int price = 4000; // 시간당 주차요금
        int hour = 10; // 주차시간
        int priceMax = 30000; // 최대 주차요금
        boolean isSmallCar = false ; // 할인 대상 여부
        boolean disabled = true; // 할인 대상 여부

        int totalPrice = hour * price;
        if ((price * hour) > priceMax) {
            totalPrice = priceMax;
        } if (isSmallCar || disabled) {
            totalPrice = totalPrice / 2;
        }
        System.out.println("주차 요금은 " + totalPrice + " 원입니다.");
    }
}