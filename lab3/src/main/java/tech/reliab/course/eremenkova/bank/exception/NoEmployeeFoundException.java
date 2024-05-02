package tech.reliab.course.eremenkova.bank.exception;

public class NoEmployeeFoundException extends RuntimeException {
    public NoEmployeeFoundException() {
        super("Не удалось найти подходящего сотрудника.");
    }
}
