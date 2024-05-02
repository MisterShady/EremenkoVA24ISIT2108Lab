package tech.reliab.course.eremenkova.bank.entity;

public class PaymentAccount {
    private long id;
    private User user;
    private String bankName;
    private double balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PaymentAccount" +
               "\nid=" + id +
               ", \nuserId=" + user.getId() +
               ", \nbankName='" + bankName + '\'' +
               ", \nbalance=" + balance;
    }
}
