import java.util.Scanner;
public class DepositCalculator {
        public static void main(String[] args) {
                printSavings();
        }
        static double calculateComplexPercent(double amount, double yearlyCoefficient, int monthlyCoefficient) {
        double pay = amount * Math.pow((1 + yearlyCoefficient / 12), 12 * monthlyCoefficient);
        return printResult(pay, 2);
        }

        static double calculateUsualPercent(double amount, double yearRate, int depositPeriod){
        return printResult(amount + amount * yearRate * depositPeriod, 2);
        }

        static double printResult(double value, int places) {
        double result = Math.pow(10, places);
        return Math.round(value * result) / result;
        }

        static void printSavings() {
        int timeOfInvestment;
        int command;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        timeOfInvestment = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        command = scanner.nextInt();
        double savings = 0;

        if (command == 1) {
            savings = calculateUsualPercent(amount, 0.06, timeOfInvestment);
        } else if (command == 2) {
            savings = calculateComplexPercent(amount, 0.06, timeOfInvestment);
        }
        System.out.println("Результат вклада: " + amount + " за " + timeOfInvestment + " лет превратятся в " + savings);
        }






}
