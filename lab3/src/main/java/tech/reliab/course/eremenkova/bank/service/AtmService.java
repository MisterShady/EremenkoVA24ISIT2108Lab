package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankAtm;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.entity.Employee;

/**
 * The interface Atm service.
 */
public interface AtmService {
    /**
     * Create bank atm.
     *
     * @param id                 the id
     * @param name               the name
     * @param statusAtm          the status atm
     * @param bank               the bank
     * @param bankOffice         the bank office
     * @param serviceEmployee    the service employee
     * @param worksForWithdrawal the works for withdrawal
     * @param moneyInAtm         the money in atm
     * @param acceptsDeposits    the accepts deposits
     * @param maintenanceCost    the maintenance cost
     * @return the bank atm
     */
    BankAtm createBankAtm(Long id, String name, Boolean statusAtm, Bank bank, BankOffice bankOffice, Employee
            serviceEmployee, Boolean worksForWithdrawal, Double moneyInAtm, Boolean acceptsDeposits, Double maintenanceCost);

    /**
     * Read bank atm.
     *
     * @param id the id
     * @return the bank atm
     */
    BankAtm readBankAtm(Long id);

    /**
     * Update bank atm.
     *
     * @param bankAtm the bank atm
     */
    void updateBankAtm(BankAtm bankAtm);

    /**
     * Delete bank atm.
     *
     * @param id the id
     */
    void deleteBankAtm(Long id);
}