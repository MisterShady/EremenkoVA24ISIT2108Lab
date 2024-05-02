package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;

/**
 * The interface Bank service.
 */
public interface BankService {
    /**
     * Create bank.
     *
     * @param id   the id
     * @param name the name
     * @return the bank
     */
    Bank createBank(Long id, String name);

    /**
     * Read bank.
     *
     * @param id the id
     * @return the bank
     */
    Bank readBank(Long id);

    /**
     * Update bank.
     *
     * @param id   the id
     * @param bank the bank
     */
    void updateBank(Long id, Bank bank);

    /**
     * Delete bank.
     *
     * @param id   the id
     * @param bank the bank
     */
    void deleteBank(Long id, Bank bank);
}
