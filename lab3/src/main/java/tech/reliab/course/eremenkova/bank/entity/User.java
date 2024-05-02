package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Getter
@Setter
public class User {
    private long id;
    private String fullName;
    private LocalDate birthDate;
    private String workplace;
    private double monthlyIncome;
    private List<Bank> usedBanks;
    private List<CreditAccount> creditAccounts;
    private List<PaymentAccount> paymentAccounts;
    private int creditRating;



    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nfullName='" + fullName + '\'' +
                ", \nbirthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", \nworkplace='" + workplace + '\'' +
                ", \nmonthlyIncome=" + monthlyIncome +
                ", \ncreditRating=" + creditRating;
    }
}
