package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.PaymentAccount;
import tech.reliab.course.eremenkova.bank.entity.User;

/**
 * The interface Payment account service.
 */
public interface PaymentAccountService {
    /**
     * Create payment account.
     *
     * @param id   the id
     * @param user the user
     * @param bank the bank
     * @return the payment account
     */
    PaymentAccount createPaymentAccount(Long id, User user, Bank bank);

    /**
     * Read payment account.
     *
     * @param id the id
     * @return the payment account
     */
    PaymentAccount readPaymentAccount(Long id);

    /**
     * Update payment account.
     *
     * @param id the id
     */
    void updatePaymentAccount(Long id);

    /**
     * Delete payment account.
     *
     * @param id the id
     */
    void deletePaymentAccount(Long id);
}
