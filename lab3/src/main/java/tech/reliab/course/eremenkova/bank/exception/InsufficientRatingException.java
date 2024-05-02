package tech.reliab.course.eremenkova.bank.exception;

public class InsufficientRatingException extends RuntimeException {
    public InsufficientRatingException() {
        super("Недостаточный рейтинг для выдачи кредита.");
    }
}
