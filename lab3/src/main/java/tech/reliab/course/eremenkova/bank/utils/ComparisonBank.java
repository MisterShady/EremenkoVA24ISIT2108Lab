package tech.reliab.course.eremenkova.bank.utils;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.BankAtm;
import tech.reliab.course.eremenkova.bank.entity.BankOffice;
import tech.reliab.course.eremenkova.bank.entity.Employee;
import tech.reliab.course.eremenkova.bank.exception.NoBankOfficeFoundException;
import tech.reliab.course.eremenkova.bank.exception.NoBanksFoundException;
import tech.reliab.course.eremenkova.bank.exception.NoEmployeeFoundException;

import java.util.List;

public class ComparisonBank {
    public Bank chooseBestBank(List<Bank> banks) throws NoBanksFoundException {
        if (banks.isEmpty()) {
            throw new NoBanksFoundException();
        }
        return banks.stream()
                .max((bank1, bank2) -> {
                    double sum1 = bank1.getBankOfficeList().size() +
                                  bank1.getBankAtmList().size() +
                                  bank1.getEmployeeList().size() +
                                  (100 - bank1.getInterestRate());
                    double sum2 = bank2.getBankOfficeList().size() +
                                  bank2.getBankAtmList().size() +
                                  bank2.getEmployeeList().size() +
                                  (100 - bank1.getInterestRate());
                    if (sum1 != sum2) {
                        return Double.compare(sum1, sum2);
                    }
                    return 0;
                })
                .orElseThrow(NoBanksFoundException::new);
    }

    public BankOffice chooseBestBankOffice(Bank bank, double sumRequested) throws NoBankOfficeFoundException {
        List<BankOffice> bankOffices = bank.getBankOfficeList();
        return bankOffices.stream()
                .filter(BankOffice::isStatusOffice)
                .filter(BankOffice::isCanProvideCredit)
                .filter(bankOffice -> bankOffice.getMoneyInOffice() > sumRequested)
                .filter(bankOffice -> {
                    List<BankAtm> atmsInOffice = bank.getBankAtmList().stream()
                            .filter(atm -> atm.getBankOffice().getId() == bankOffice.getId())
                            .toList();
                    return atmsInOffice.stream()
                            .anyMatch(atm -> atm.isStatusAtm() && atm.isWorksForWithdrawal() && atm.getMoneyInAtm() > sumRequested);
                })
                .findFirst()
                .orElseThrow(NoBankOfficeFoundException::new);
    }

    public Employee chooseBestEmployee(List<Employee> employees) throws NoEmployeeFoundException {
        return employees.stream()
                .filter(Employee::isCanProvideLoans)
                .findFirst()
                .orElseThrow(NoEmployeeFoundException::new);
    }
}
