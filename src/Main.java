//Monthly Balance
public class Main {
    public static void main(String[] args) {
        double acc_balance = 5000.0;
        double interest_Rate = 0.17; // 17% interest rate
        double monthlyInterestRate = interest_Rate / 12.0;


        double interestOneMonth = acc_balance * monthlyInterestRate * 1;
        double interestTwoMonths = acc_balance * monthlyInterestRate * 2;

        System.out.println("Interest due after one month: $" + interestOneMonth);
        System.out.println("Interest due after two months: $" + interestTwoMonths);
    }
}
