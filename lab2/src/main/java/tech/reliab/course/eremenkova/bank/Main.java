package tech.reliab.course.eremenkova.bank;

import tech.reliab.course.eremenkova.bank.entity.*;
import tech.reliab.course.eremenkova.bank.utils.BankGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankGenerator bankGenerator = new BankGenerator();
        Scanner scanner = new Scanner(System.in);
        bankGenerator.generateBanks();
        bankGenerator.generateOffices();
        bankGenerator.generateEmployees();
        bankGenerator.generateATMs();
        bankGenerator.generateUsers();
        bankGenerator.paymentAccount();
        bankGenerator.creditAccount();
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
                    handleBankSelection(selectedBank, scanner);
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
                    handleUserSelection(selectedUser, scanner);
                    break;
                case 3:
                    System.out.println("Завершение работы программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }

    private static void handleBankSelection(Bank bank, Scanner scanner) {
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

    private static void handleUserSelection(User user, Scanner scanner) {
        while (true) {
            System.out.println("\nВыберите действие для пользователя: ");
            System.out.println("1. Просмотреть платежные счета");
            System.out.println("2. Просмотреть кредитные счета");
            System.out.println("3. Назад");
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
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }

    }
}
