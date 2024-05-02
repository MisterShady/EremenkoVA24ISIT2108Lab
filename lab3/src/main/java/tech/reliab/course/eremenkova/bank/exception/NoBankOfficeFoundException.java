package tech.reliab.course.eremenkova.bank.exception;

public class NoBankOfficeFoundException extends RuntimeException {
    public NoBankOfficeFoundException() {
        super("Не удалось найти подходящий офис банка.");
    }
}
