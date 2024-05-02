package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.*;

import java.time.LocalDate;

/**
 * The interface Credit account service.
 */
public interface CreditAccountService {
    /**
     * Create credit account.
     *
     * @param id              the id
     * @param userAccount     the user account
     * @param startDate       the start date
     * @param endDate         the end date
     * @param months          the months
     * @param loanAmount      the loan amount
     * @param monthlyPayment  the monthly payment
     * @param interestRate    the interest rate
     * @param issuingEmployee the issuing employee
     * @param paymentAccount  the payment account
     * @param bank            the bank
     * @return the credit account
     */
    CreditAccount createCreditAccount(Long id, User userAccount, LocalDate startDate, LocalDate endDate, Integer months, Double loanAmount, Double monthlyPayment, Double interestRate, Employee issuingEmployee, PaymentAccount paymentAccount, Bank bank);

    /**
     * Read credit account.
     *
     * @param id the id
     * @return the credit account
     */
    CreditAccount readCreditAccount(Long id);

    /**
     * Update credit account.
     *
     * @param id the id
     */
    void updateCreditAccount(Long id);

    /**
     * Delete credit account.
     *
     * @param id the id
     */
    void deleteCreditAccount(Long id);
}
