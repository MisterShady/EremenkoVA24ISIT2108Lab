package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Getter
@Setter
public class CreditAccount {
    private long id;
    private User userAccount;
    private String bankName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int months;
    private double loanAmount;
    private double monthlyPayment;
    private double interestRate;
    private Employee issuingEmployee;
    private PaymentAccount paymentAccount;



    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nuserAccountId=" + userAccount.getId() +
                ", \nbankName='" + bankName + '\'' +
                ", \nstartDate=" + startDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", \nendDate=" + endDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", \nmonths=" + months +
                ", \nloanAmount=" + loanAmount +
                ", \nmonthlyPayment=" + monthlyPayment +
                ", \ninterestRate=" + interestRate +
                ", \nissuingEmployeeId=" + issuingEmployee.getId() +
                ", \npaymentAccountId=" + paymentAccount.getId();
    }
}
