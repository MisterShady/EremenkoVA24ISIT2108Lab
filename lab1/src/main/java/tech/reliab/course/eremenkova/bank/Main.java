package tech.reliab.course.eremenkova.bank;

import tech.reliab.course.eremenkova.bank.entity.*;
import tech.reliab.course.eremenkova.bank.service.*;
import tech.reliab.course.eremenkova.bank.service.impl.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        AtmService bankAtmService = new AtmServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        UserService userService = new UserServiceImpl();

        Bank bank = bankService.createBank(
                1L,
                "ВайБанк"
        );

        BankOffice bankOffice = bankOfficeService.createBankOffice(
                1L,
                "Главный офис",
                "ул. Пушкина, 6",
                true,
                true,
                0,
                true,
                true,
                true,
                1.0,
                1.0,
                bank
        );
        Employee employee = employeeService.createEmployee(
                1L,
                "Антонов Антон Антонович",
                LocalDate.now(),
                "Менеджер",
                bank,
                true,
                bankOffice,
                true,
                10000.0);

        User user = userService.createUser(
                1L,
                "Антонов Антон Антонович",
                LocalDate.of(1999, Month.JANUARY, 1),
                "ООО Фиаско",
                List.of(bank)
        );
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(
                1L,
                user,
                bank
        );
        BankAtm bankAtm = bankAtmService.createBankAtm(
                1L,
                "Главный банкомат",
                true,
                bank,
                bankOffice,
                employee,
                true,
                1455.0,
                true,
                1.0
        );
        CreditAccount creditAccount = creditAccountService.createCreditAccount(
                1L,
                user,
                LocalDate.now(),
                LocalDate.now(),
                1,
                1.0,
                1.0,
                1.0,
                employee,
                paymentAccount,
                bank
        );
        System.out.println();
        System.out.println(bank);
        System.out.println();
        System.out.println(bankAtm);
        System.out.println();
        System.out.println(bankOffice);
        System.out.println();
        System.out.println(creditAccount);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(paymentAccount);
        System.out.println();
        System.out.println(user);
    }
}
