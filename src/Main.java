public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountCredit;
        double percent;
        double months;
        double payment1 = service.calculate(amountCredit = 1000_000.0, percent = 9.99, months = 12.0);
        System.out.println("Сумма платежа за месяц из расчета на 1 год:" + payment1);
        double payment2 = service.calculate(amountCredit = 1000_000.0, percent = 9.99, months = 24.0);
        System.out.println("Сумма платежа за месяц из расчета на 2 года:" + payment2);
        double payment3 = service.calculate(amountCredit = 1000_000.0, percent = 9.99, months = 36.0);
        System.out.println("Сумма платежа за месяц из расчета на 3 года:" + payment3);


    }
}
