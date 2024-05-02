package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.entity.Employee;
import tech.reliab.course.eremenkova.bank.service.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImpl implements EmployeeService {
    /**
     * Creates an employee object with the specified parameters.
     *
     * @param id the unique identifier of the employee
     * @param fullName the full name of the employee
     * @param birthDate the birth date of the employee
     * @param position the position of the employee
     * @param bank the bank to which the employee belongs
     * @param worksInOffice flag indicating if the employee works in an office
     * @param office the office where the employee works
     * @param canProvideLoans flag indicating if the employee can provide loans
     * @param salary the salary of the employee
     * @return the created employee object
     */

    @Override
    public Employee createEmployee(Long id, String fullName, LocalDate birthDate, String position, Bank bank, Boolean worksInOffice, BankOffice office, Boolean canProvideLoans, Double salary) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFullName(fullName);
        employee.setBirthDate(birthDate);
        employee.setPosition(position);
        employee.setBank(bank);
        employee.setWorksInOffice(worksInOffice);
        employee.setOffice(office);
        employee.setCanProvideLoans(canProvideLoans);
        employee.setSalary(salary);
        return employee;
    }

    @Override
    public Employee readEmployee(Long id) {
        return null;
    }

    @Override
    public void updateEmployee(Long id) {
    }

    @Override
    public void deleteEmployee(Long id) {
    }
}
