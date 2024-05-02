package tech.reliab.course.eremenkova.bank.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(User userAccount) {
        this.userAccount = userAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Employee getIssuingEmployee() {
        return issuingEmployee;
    }

    public void setIssuingEmployee(Employee issuingEmployee) {
        this.issuingEmployee = issuingEmployee;
    }

    public PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    @Override
    public String toString() {
        return "CreditAccount" +
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
