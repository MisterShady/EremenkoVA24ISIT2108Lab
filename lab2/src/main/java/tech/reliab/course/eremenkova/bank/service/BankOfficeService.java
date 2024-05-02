package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;

/**
 * The interface Bank office service.
 */
public interface BankOfficeService {
    /**
     * Create bank office.
     *
     * @param id                 the id
     * @param nameOffice         the name office
     * @param addressOffice      the address office
     * @param statusOffice       the status office
     * @param canPlaceAtm        the can place atm
     * @param canProvideCredit   the can provide credit
     * @param worksForWithdrawal the works for withdrawal
     * @param acceptsDeposits    the accepts deposits
     * @param moneyInOffice      the money in office
     * @param rentCost           the rent cost
     * @param bank               the bank
     * @return the bank office
     */
    BankOffice createBankOffice(Long id, String nameOffice, String addressOffice, boolean statusOffice, Boolean canPlaceAtm, Boolean canProvideCredit, Boolean worksForWithdrawal, Boolean acceptsDeposits, Double moneyInOffice, Double rentCost, Bank bank);

    /**
     * Read bank office.
     *
     * @param id the id
     * @return the bank office
     */
    BankOffice readBankOffice(Long id);

    /**
     * Update bank office.
     *
     * @param bankOffice the bank office
     */
    void updateBankOffice(BankOffice bankOffice);

    /**
     * Delete bank office.
     *
     * @param id the id
     */
    void deleteBankOffice(Long id);
}
