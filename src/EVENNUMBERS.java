public class EVENNUMBERS {
    public static void main(String[] args) {
        int number = 10;

        while (number <= 24) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number += 2;
        }
    }
}
