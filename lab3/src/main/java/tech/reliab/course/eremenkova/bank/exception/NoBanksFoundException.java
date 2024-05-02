package tech.reliab.course.eremenkova.bank.exception;

public class NoBanksFoundException extends RuntimeException {
    public NoBanksFoundException() {
        super("Не найдено ни одного банка в списке.");
    }
}
