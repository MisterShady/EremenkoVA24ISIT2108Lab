package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.*;
import tech.reliab.course.eremenkova.bank.service.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImpl implements CreditAccountService {
    /**
     * Creates a credit account object with the specified parameters.
     *
     * @param id the unique identifier of the credit account
     * @param userAccount the user associated with the credit account
     * @param startDate the start date of the credit account
     * @param endDate the end date of the credit account
     * @param months the duration of the credit account in months
     * @param loanAmount the amount of the loan associated with the credit account
     * @param monthlyPayment the monthly payment for the credit account
     * @param interestRate the interest rate for the credit account
     * @param issuingEmployee the employee who issued the credit account
     * @param paymentAccount the payment account associated with the credit account
     * @param bank the bank associated with the credit account
     * @return the created credit account object
     */

    @Override
    public CreditAccount createCreditAccount(Long id,
                                             User userAccount,
                                             LocalDate startDate,
                                             LocalDate endDate,
                                             Integer months,
                                             Double loanAmount,
                                             Double monthlyPayment,
                                             Double interestRate,
                                             Employee issuingEmployee,
                                             PaymentAccount paymentAccount,
                                             Bank bank) {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setId(id);
        creditAccount.setUserAccount(userAccount);
        creditAccount.setBankName(bank.getName());
        creditAccount.setStartDate(startDate);
        creditAccount.setEndDate(endDate);
        creditAccount.setMonths(months);
        creditAccount.setLoanAmount(loanAmount);
        creditAccount.setMonthlyPayment(monthlyPayment);
        creditAccount.setInterestRate(bank.getInterestRate());
        creditAccount.setIssuingEmployee(issuingEmployee);
        creditAccount.setPaymentAccount(paymentAccount);
        return creditAccount;
    }

    @Override
    public CreditAccount readCreditAccount(Long id) {
        return null;
    }

    @Override
    public void updateCreditAccount(Long id) {
    }

    @Override
    public void deleteCreditAccount(Long id) {
    }
}
