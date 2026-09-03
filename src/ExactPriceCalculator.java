import java.util.Scanner;
public class ExactPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long priceWon = 0;
        long count = 0;
        long discountRate = 0;
        do {
            System.out.print("단가(원): ");
            priceWon = scanner.nextLong();

        } while (priceWon <= 0);

        do {
            System.out.print("수량(개): ");
            count = scanner.nextLong();

        } while (count <= 0);

        do {
            System.out.print("할인율(%): ");
            discountRate = scanner.nextLong();
        } while (discountRate < 0 || discountRate > 100);

        long subtotalWon = priceWon * count;
        long discountWon = (long) (subtotalWon * 0.15);
        long paymentWon = subtotalWon - discountWon;

        System.out.printf("소계: %,d원%n", subtotalWon);
        System.out.printf("할인: %,d원%n", discountWon);
        System.out.printf("결제: %,d원%n", paymentWon);

        scanner.close();
    }
}
