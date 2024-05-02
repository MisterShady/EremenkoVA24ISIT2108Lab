package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
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
