package tech.reliab.course.eremenkova.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public List<Bank> getUsedBanks() {
        return usedBanks;
    }

    public void setUsedBanks(List<Bank> usedBanks) {
        this.usedBanks = usedBanks;
    }

    public List<CreditAccount> getCreditAccounts() {
        return creditAccounts;
    }

    public void setCreditAccounts(List<CreditAccount> creditAccounts) {
        this.creditAccounts = creditAccounts;
    }

    public List<PaymentAccount> getPaymentAccounts() {
        return paymentAccounts;
    }

    public void setPaymentAccounts(List<PaymentAccount> paymentAccounts) {
        this.paymentAccounts = paymentAccounts;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nfullName='" + fullName + '\'' +
                ", \nbirthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", \nworkplace='" + workplace + '\'' +
                ", \nmonthlyIncome=" + monthlyIncome +
                ", \nusedBanks=" + usedBanks +
                ", \ncreditAccounts=" + creditAccounts +
                ", \npaymentAccounts=" + paymentAccounts +
                ", \ncreditRating=" + creditRating;
    }
}
