package tech.reliab.course.eremenkova.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private long id;
    private String fullName;
    private LocalDate birthDate;
    private String position;
    private Bank bank;
    private boolean worksInOffice;
    private BankOffice office;
    private boolean canProvideLoans;
    private double salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean isWorksInOffice() {
        return worksInOffice;
    }

    public void setWorksInOffice(boolean worksInOffice) {
        this.worksInOffice = worksInOffice;
    }

    public BankOffice getOffice() {
        return office;
    }

    public void setOffice(BankOffice office) {
        this.office = office;
    }

    public boolean isCanProvideLoans() {
        return canProvideLoans;
    }

    public void setCanProvideLoans(boolean canProvideLoans) {
        this.canProvideLoans = canProvideLoans;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" +
               " \nid=" + id +
               ", \nfullName='" + fullName + '\'' +
               ", \nbirthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
               ", \nposition='" + position + '\'' +
               ", \nbankName=" + bank.getName() +
               ", \nworksInOffice=" + worksInOffice +
               ",\n officeId=" + office.getId() +
               ", \ncanProvideLoans=" + canProvideLoans +
               ", \nsalary=" + salary;
    }
}
