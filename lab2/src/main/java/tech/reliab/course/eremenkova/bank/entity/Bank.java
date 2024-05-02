package tech.reliab.course.eremenkova.bank.entity;

import java.util.List;

public class Bank {
    private long id;
    private String name;
    private List<BankOffice> bankOfficeList;
    private List<BankAtm> bankAtmList;
    private List<Employee> employeeList;
    private List<User> userList;
    private int bankRating;
    private double totalMoneyInBank;
    private double interestRate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankOffice> getBankOfficeList() {
        return bankOfficeList;
    }

    public void setBankOfficeList(List<BankOffice> bankOfficeList) {
        this.bankOfficeList = bankOfficeList;
    }

    public List<BankAtm> getBankAtmList() {
        return bankAtmList;
    }

    public void setBankAtmList(List<BankAtm> bankAtmList) {
        this.bankAtmList = bankAtmList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getBankRating() {
        return bankRating;
    }

    public void setBankRating(int bankRating) {
        this.bankRating = bankRating;
    }

    public double getTotalMoneyInBank() {
        return totalMoneyInBank;
    }

    public void setTotalMoneyInBank(double totalMoneyInBank) {
        this.totalMoneyInBank = totalMoneyInBank;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nname='" + name + '\'' +
                ", \nbankRating=" + bankRating +
                ", \ntotalMoneyInBank=" + totalMoneyInBank +
                ", \ninterestRate=" + interestRate;
    }
}
