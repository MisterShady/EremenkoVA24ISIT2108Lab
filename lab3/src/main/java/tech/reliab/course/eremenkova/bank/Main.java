package tech.reliab.course.eremenkova.bank;

import tech.reliab.course.eremenkova.bank.entity.*;
import tech.reliab.course.eremenkova.bank.exception.*;
import tech.reliab.course.eremenkova.bank.service.PaymentAccountService;
import tech.reliab.course.eremenkova.bank.service.impl.PaymentAccountServiceImpl;
import tech.reliab.course.eremenkova.bank.utils.BankGenerator;
import tech.reliab.course.eremenkova.bank.utils.ComparisonBank;
import tech.reliab.course.eremenkova.bank.utils.CreditProvideChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static BankGenerator bankGenerator = new BankGenerator();
    static Scanner scanner = new Scanner(System.in);
    static PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();

    public static void main(String[] args) {
        bankGenerator.generateBanks();
        bankGenerator.generateOffices();
        bankGenerator.generateEmployees();
        bankGenerator.generateATMs();
        bankGenerator.generateUsers();
        bankGenerator.generatePaymentAccounts();
        bankGenerator.generateCreditAccounts();
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Просмотреть банки");
            System.out.println("2. Просмотреть пользователей");
            System.out.println("3. Выход");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nСписок банков:");
                    for (int i = 0; i < bankGenerator.banks.size(); i++) {
                        System.out.println((i + 1) + ". " + bankGenerator.banks.get(i).getName());
                    }
                    System.out.println("Выберите банк:");
                    int bankChoice = scanner.nextInt();
                    Bank selectedBank = bankGenerator.banks.get(bankChoice - 1);
                    System.out.println(selectedBank);
                    handleBankSelection(selectedBank);
                    break;
                case 2:
                    List<User> users = new ArrayList<>();
                    for (Bank bank : bankGenerator.banks) {
                        users.addAll(bank.getUserList());
                    }
                    System.out.println("Список пользователей:");
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println((i + 1) + ". " + users.get(i).getFullName());
                    }
                    System.out.println("Выберите пользователя:");
                    int userChoice = scanner.nextInt();
                    User selectedUser = users.get(userChoice - 1);
                    System.out.println(selectedUser);
                    handleUserSelection(selectedUser);
                    break;
                case 3:
                    System.out.println("Завершение работы программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void handleBankSelection(Bank bank) {
        while (true) {
            System.out.println("\nВыберите действие для банка '" + bank.getName() + "':");
            System.out.println("1. Просмотреть офисы");
            System.out.println("2. Просмотреть банкоматы");
            System.out.println("3. Просмотреть сотрудников");
            System.out.println("4. Назад");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Список офисов:");
                    for (BankOffice office : bank.getBankOfficeList()) {
                        System.out.println(office.toString());
                    }
                    break;
                case 2:
                    System.out.println("Список банкоматов:");
                    for (BankAtm atm : bank.getBankAtmList()) {
                        System.out.println(atm.toString());
                    }
                    break;
                case 3:
                    System.out.println("Список сотрудников:");
                    for (Employee employee : bank.getEmployeeList()) {
                        System.out.println(employee.toString());
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void handleUserSelection(User user) {
        while (true) {
            System.out.println("\nВыберите действие для пользователя: ");
            System.out.println("1. Просмотреть платежные счета");
            System.out.println("2. Просмотреть кредитные счета");
            System.out.println("3. Оформить кредит");
            System.out.println("4. Назад");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Платежные счета пользователя: ");
                    for (PaymentAccount account : user.getPaymentAccounts()) {
                        System.out.println(account.toString());
                    }
                    break;
                case 2:
                    System.out.println("Кредитные счета пользователя: ");
                    for (CreditAccount account : user.getCreditAccounts()) {
                        System.out.println(account.toString());
                    }
                    break;
                case 3:
                    System.out.println("Выберите ручной(1) или автоматический(2) режим подбора кредита");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> {
                            manualMode(user);
                        }
                        case 2 -> {
                            automaticMode(user);
                        }
                    }
                case 4:
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }

    }

    private static void automaticMode(User user) {
        System.out.println("Автоматический режим подбора");
        ComparisonBank comparisonBank = new ComparisonBank();
        Bank bestBank = comparisonBank.chooseBestBank(bankGenerator.banks);
        System.out.println("Введите запрошенную сумму: ");
        double requestedSum = scanner.nextDouble();
        BankOffice bestBankOffice = comparisonBank.chooseBestBankOffice(bestBank, requestedSum);
        Employee bestEmployee = comparisonBank.chooseBestEmployee(bestBank.getEmployeeList());
        provideCredit(user, bestBank, bestEmployee, requestedSum);
    }

    private static void provideCredit(User user, Bank bestBank, Employee bestEmployee, double requestedSum) {
        CreditProvideChecker creditProvideChecker = new CreditProvideChecker();
        try {
            creditProvideChecker.hasPaymentAccountInBank(bestBank, user);

        } catch (PaymentAccountNotFoundException e) {
            bankGenerator.generatePaymentAccount(bestBank, user);
            System.out.println("Добавлен платежный счет в " + bestBank.getName());
        }
        try {
            creditProvideChecker.hasSufficientRating(user.getCreditRating(), bestBank.getBankRating());
            bankGenerator.generateCreditAccount(bestBank, user, bestEmployee, user.getPaymentAccounts().getLast(), requestedSum);
            System.out.println("Кредит успешно оформлен в " + bestBank.getName());
        } catch (InsufficientRatingException e) {
            System.out.println("В выдаче кредита отказано из-за низкого кредитного рейтинга");
        }
    }

    private static void manualMode(User user) {
        System.out.println("Ручной режим подбора");
        System.out.println("Список доступных банков");
        if (bankGenerator.banks.isEmpty()) {
            throw new NoBanksFoundException();
        }
        for (int i = 0; i < bankGenerator.banks.size(); i++) {
            System.out.println((i + 1) + ". " + bankGenerator.banks.get(i).getName());
        }
        System.out.print("Выберите номер банка, где будет оформлен кредит: ");
        int selectNumber = scanner.nextInt();
        Bank selectedBank = bankGenerator.banks.get(selectNumber - 1);
        System.out.println(selectedBank);
        System.out.println("Список доступных офисов");
        if (bankGenerator.banks.isEmpty()) {
            throw new NoBankOfficeFoundException();
        }
        for (BankOffice office : selectedBank.getBankOfficeList()) {
            System.out.println(office.toString());
        }
        System.out.print("Выберите номер офиса, где будет оформлен кредит: ");
        selectNumber = scanner.nextInt();
        BankOffice selectedOffice = selectedBank.getBankOfficeList().get(selectNumber - 1);
        System.out.println(selectedOffice);
        System.out.println();
        System.out.println("Список доступных сотрудников");
        if (bankGenerator.banks.isEmpty()) {
            throw new NoEmployeeFoundException();
        }
        List<Employee> employeeListOfSelectedOffice = selectedBank.getEmployeeList()
                .stream()
                .filter(employee -> employee
                        .getOffice()
                        .equals(selectedOffice))
                .toList();

        for (Employee employee : employeeListOfSelectedOffice) {
            System.out.println(employee.toString());
        }
        System.out.print("Выберите номер сотрудника, который оформит кредит: ");
        selectNumber = scanner.nextInt();
        Employee selectedEmployee = employeeListOfSelectedOffice.get(selectNumber - 1);
        System.out.println(selectedEmployee);
        System.out.println("Введите запрошенную сумму: ");
        double requestedSum = scanner.nextDouble();
        if (requestedSum>selectedOffice.getMoneyInOffice()){
            throw new NotEnoughMoneyInOfficeException();
        }
        provideCredit(user, selectedBank, selectedEmployee, requestedSum);
    }

}