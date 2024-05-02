package tech.reliab.course.eremenkova.bank.entity;

public class Bank {
    private long id;
    private String name;
    private int numberOfOffices;
    private int numberOfATMs;
    private int numberOfEmployees;
    private int numberOfClients;
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

    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    public void setNumberOfOffices(int numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    public int getNumberOfATMs() {
        return numberOfATMs;
    }

    public void setNumberOfATMs(int numberOfATMs) {
        this.numberOfATMs = numberOfATMs;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
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
        return "Bank" +
               "\nid=" + id +
               ", \nname='" + name + '\'' +
               ", \nnumberOfOffices=" + numberOfOffices +
               ", \nnumberOfATMs=" + numberOfATMs +
               ", \nnumberOfEmployees=" + numberOfEmployees +
               ", \nnumberOfClients=" + numberOfClients +
               ", \nbankRating=" + bankRating +
               ", \ntotalMoneyInBank=" + totalMoneyInBank +
               ", \ninterestRate=" + interestRate;
    }
}
