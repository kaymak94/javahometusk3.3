public class CreditPaymentService {
    public double calculate(double amountCredit, double percent, double months) {

        double payment = amountCredit * ((percent / (100 * months)) + ((percent / (100 * months)) / (Math.pow((1 + (percent / (100 * months))), months) - 1)));
        return payment;
    }


}

