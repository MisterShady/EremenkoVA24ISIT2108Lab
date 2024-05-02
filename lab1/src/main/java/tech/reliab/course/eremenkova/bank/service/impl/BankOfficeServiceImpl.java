package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    /**
     * Creates a bank office object with the specified parameters.
     *
     * @param id the unique identifier of the bank office
     * @param nameOffice the name of the bank office
     * @param addressOffice the address of the bank office
     * @param statusOffice the status of the bank office
     * @param canPlaceAtm flag indicating if the office can place ATMs
     * @param numberOfATMs the number of ATMs in the office
     * @param canProvideCredit flag indicating if the office can provide credit
     * @param worksForWithdrawal flag indicating if the office works for cash withdrawal
     * @param acceptsDeposits flag indicating if the office accepts deposits
     * @param moneyInOffice the amount of money in the office
     * @param rentCost the cost of rent for the office
     * @param bank the bank to which the office belongs
     * @return the created bank office object
     * @throws IllegalArgumentException if the number of ATMs in the office exceeds the total number of ATMs in the bank
     */

    @Override
    public BankOffice createBankOffice(Long id,
                                       String nameOffice,
                                       String addressOffice,
                                       boolean statusOffice,
                                       Boolean canPlaceAtm,
                                       Integer numberOfATMs,
                                       Boolean canProvideCredit,
                                       Boolean worksForWithdrawal,
                                       Boolean acceptsDeposits,
                                       Double moneyInOffice,
                                       Double rentCost,
                                       Bank bank) {
        BankOffice bankOffice=new BankOffice();
        bankOffice.setId(id);
        bankOffice.setNameOffice(nameOffice);
        bankOffice.setAddressOffice(addressOffice);
        bankOffice.setStatusOffice(statusOffice);
        bankOffice.setCanPlaceAtm(canPlaceAtm);
        if (bankOffice.getNumberOfATMs() > bank.getNumberOfATMs()) {
            throw new IllegalArgumentException("Количество банкоматов в офисе больше, чем общее количество банкоматов у банка");
        } else {
            bankOffice.setNumberOfATMs(numberOfATMs);
        }
        bankOffice.setNumberOfATMs(numberOfATMs);
        bankOffice.setCanProvideCredit(canProvideCredit);
        bankOffice.setWorksForWithdrawal(worksForWithdrawal);
        bankOffice.setAcceptsDeposits(acceptsDeposits);
        bankOffice.setMoneyInOffice(bank.getTotalMoneyInBank());
        bankOffice.setRentCost(rentCost);
        return bankOffice;
    }

    @Override
    public BankOffice readBankOffice(Long id) {
        return null;
    }

    @Override
    public void updateBankOffice(BankOffice bankOffice) {
    }

    @Override
    public void deleteBankOffice(Long id) {
    }
}
