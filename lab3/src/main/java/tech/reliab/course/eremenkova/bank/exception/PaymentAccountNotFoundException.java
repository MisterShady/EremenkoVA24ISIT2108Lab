package tech.reliab.course.eremenkova.bank.exception;

public class PaymentAccountNotFoundException extends RuntimeException {
    public PaymentAccountNotFoundException(String bankName) {
        super("Не удалось найти счета в банке: " + bankName);
    }
}
