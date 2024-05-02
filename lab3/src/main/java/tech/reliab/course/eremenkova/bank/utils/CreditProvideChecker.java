package tech.reliab.course.eremenkova.bank.utils;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.PaymentAccount;
import tech.reliab.course.eremenkova.bank.entity.User;
import tech.reliab.course.eremenkova.bank.exception.InsufficientRatingException;
import tech.reliab.course.eremenkova.bank.exception.PaymentAccountNotFoundException;

import java.util.List;

public class CreditProvideChecker {
    public boolean hasPaymentAccountInBank(Bank bank, User user) {
        List<PaymentAccount> paymentAccountList = user.getPaymentAccounts();
        List<PaymentAccount> paymentAccountsOfBanks = paymentAccountList.stream()
                .filter(paymentAccount -> paymentAccount.getBankName().equals(bank.getName()))
                .toList();

        if (paymentAccountsOfBanks.isEmpty()) {
            throw new PaymentAccountNotFoundException(bank.getName());
        }

        return true;
    }
    public boolean hasSufficientRating(double creditRatingOfUser, double ratingOfBank) {
        if (creditRatingOfUser < 500 && ratingOfBank > 50) {
            throw new InsufficientRatingException();
        }

        return true;
    }

}
