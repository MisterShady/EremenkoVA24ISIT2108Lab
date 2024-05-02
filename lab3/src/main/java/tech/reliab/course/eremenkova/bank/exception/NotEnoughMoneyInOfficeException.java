package tech.reliab.course.eremenkova.bank.exception;

public class NotEnoughMoneyInOfficeException extends RuntimeException{
    public NotEnoughMoneyInOfficeException() {
        super("В офисе недостаточно денег для клиента");
    }
}
