package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankAtm;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.entity.Employee;
import tech.reliab.course.eremenkova.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    /**
     * Creates a bank ATM object.
     *
     * @param id the unique identifier of the ATM
     * @param name the name of the ATM
     * @param statusAtm the current status of the ATM
     * @param bank the bank to which the ATM belongs
     * @param bankOffice the bank office where the ATM is located
     * @param serviceEmployee the employee servicing the ATM
     * @param worksForWithdrawal flag indicating if cash withdrawal is available
     * @param moneyInAtm the amount of cash in the ATM
     * @param acceptsDeposits flag indicating if deposits are accepted
     * @param maintenanceCost the maintenance cost of the ATM
     * @return the created bank ATM object
     * @throws IllegalArgumentException if the amount of money in the bank is less than in the ATM
     */

    @Override
    public BankAtm createBankAtm(Long id, String name, Boolean statusAtm, Bank bank, BankOffice bankOffice, Employee
            serviceEmployee, Boolean worksForWithdrawal, Double moneyInAtm, Boolean acceptsDeposits, Double maintenanceCost) {
        BankAtm bankAtm = new BankAtm();
        bankAtm.setId(id);
        bankAtm.setName(name);
        bankAtm.setAddressAtm(bankOffice.getAddressOffice());
        bankAtm.setStatusAtm(statusAtm);
        bankAtm.setBank(bank);
        bankAtm.setBankOffice(bankOffice);
        bankAtm.setServiceEmployee(serviceEmployee);
        bankAtm.setWorksForWithdrawal(worksForWithdrawal);
        bankAtm.setAcceptsDeposits(acceptsDeposits);
        if (bank.getTotalMoneyInBank() < bankAtm.getMoneyInAtm()) {
            throw new IllegalArgumentException("Денег в банке меньше, чем в банкомате");
        } else {
            bankAtm.setMoneyInAtm(moneyInAtm);
        }
        bankAtm.setMaintenanceCost(maintenanceCost);
        return bankAtm;
    }

    @Override
    public BankAtm readBankAtm(Long id) {
        return null;
    }

    @Override
    public void updateBankAtm(BankAtm bankAtm) {
    }

    @Override
    public void deleteBankAtm(Long id) {
    }
}
