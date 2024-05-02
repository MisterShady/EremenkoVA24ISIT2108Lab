package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Getter
@Setter
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



    @Override
    public String toString() {
        return
                " \nid=" + id +
                ", \nfullName='" + fullName + '\'' +
                ", \nbirthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", \nposition='" + position + '\'' +
                ", \nbankName=" + bank.getName() +
                ", \nworksInOffice=" + worksInOffice +
                ",\nofficeId=" + office.getId() +
                ", \ncanProvideLoans=" + canProvideLoans +
                ", \nsalary=" + salary;
    }
}
