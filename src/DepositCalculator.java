import java.util.Scanner;
public class DepositCalculator {
        public static void main(String[] args) {
                printSavings();
        }
        static double calculateComplexPercent(double amount, double coefficient, int anotherCoefficient) {
        double pay = amount * Math.pow((1 + coefficient / 12), 12 * anotherCoefficient);
        return result(pay, 2);
        }

        static double calculateUsualPercent(double amount, double yearRate, int depositPeriod){
        return result(amount + amount * yearRate * depositPeriod, 2);
        }

        static double result(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
        }

        static void printSavings() {
        int timeOfInvestment;
        int action;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        timeOfInvestment = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double savings = 0;

        if (action == 1) {
            savings = calculateUsualPercent(amount, 0.06, timeOfInvestment);
        } else if (action == 2) {
            savings = calculateComplexPercent(amount, 0.06, timeOfInvestment);
        }
        System.out.println("Результат вклада: " + amount + " за " + timeOfInvestment + " лет превратятся в " + savings);
        }






}
