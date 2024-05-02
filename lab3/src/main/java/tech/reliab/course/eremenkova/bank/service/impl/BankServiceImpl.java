package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.service.BankService;

import java.util.ArrayList;
import java.util.Random;

public class BankServiceImpl implements BankService {
    /**
     * Creates a bank object with the specified parameters.
     *
     * @param id   the unique identifier of the bank
     * @param name the name of the bank
     * @return the created bank object
     */

    @Override
    public Bank createBank(Long id, String name) {
        Random random = new Random();
        Bank bank = new Bank();
        bank.setId(id);
        bank.setName(name);
        bank.setBankOfficeList(new ArrayList<>());
        bank.setBankAtmList(new ArrayList<>());
        bank.setEmployeeList(new ArrayList<>());
        bank.setUserList(new ArrayList<>());
        bank.setBankRating(random.nextInt(101));
        bank.setTotalMoneyInBank(Math.round(random.nextDouble(1000000) * 100.0) / 100.0);
        bank.setInterestRate(Math.round((20 - bank.getBankRating() / 5.0) * 100.0) / 100.0);
        return bank;
    }

    @Override
    public Bank readBank(Long id) {
        return null;
    }

    @Override
    public void updateBank(Long id, Bank bank) {
    }

    @Override
    public void deleteBank(Long id, Bank bank) {
    }
}
