package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.entity.Employee;

import java.time.LocalDate;

/**
 * The interface Employee service.
 */
public interface EmployeeService {
    /**
     * Create employee.
     *
     * @param id              the id
     * @param fullName        the full name
     * @param birthDate       the birth date
     * @param position        the position
     * @param bank            the bank
     * @param worksInOffice   the works in office
     * @param office          the office
     * @param canProvideLoans the can provide loans
     * @param salary          the salary
     * @return the employee
     */
    Employee createEmployee(Long id, String fullName, LocalDate birthDate, String position, Bank bank, Boolean worksInOffice, BankOffice office, Boolean canProvideLoans, Double salary);

    /**
     * Read employee.
     *
     * @param id the id
     * @return the employee
     */
    Employee readEmployee(Long id);

    /**
     * Update employee.
     *
     * @param id the id
     */
    void updateEmployee(Long id);

    /**
     * Delete employee.
     *
     * @param id the id
     */
    void deleteEmployee(Long id);
}
