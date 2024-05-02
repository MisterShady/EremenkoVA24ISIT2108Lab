package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.PaymentAccount;
import tech.reliab.course.eremenkova.bank.entity.User;
import tech.reliab.course.eremenkova.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    /**
     * Creates a payment account object with the specified parameters.
     *
     * @param id the unique identifier of the payment account
     * @param user the user associated with the payment account
     * @param bank the bank associated with the payment account
     * @return the created payment account object
     */

    @Override
    public PaymentAccount createPaymentAccount(Long id, User user, Bank bank) {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setId(id);
        paymentAccount.setUser(user);
        paymentAccount.setBankName(bank.getName());
        paymentAccount.setBalance(0.0);
        return paymentAccount;
    }

    @Override
    public PaymentAccount readPaymentAccount(Long id) {
        return null;
    }

    @Override
    public void updatePaymentAccount(Long id) {
    }

    @Override
    public void deletePaymentAccount(Long id) {
    }

}
