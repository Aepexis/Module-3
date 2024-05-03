import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int income;
        double txRate;
        int txPercent;

        income = scnr.nextInt();

        if (income < 500){
            txRate = .10;
        }
        else if ((income >= 500) && (income < 1500)) {
            txRate = .15;
        }
        else if ((income >= 1500) && (income < 2500)) {
            txRate = .20;
        }
        else {
            txRate = .30;
        }
        txPercent = (int) (txRate * 100);
        System.out.println("With an income of $" + income + " your tax rate is: " + txPercent + "%");
    }
}