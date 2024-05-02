package tech.reliab.course.eremenkova.bank.entity;

public class BankOffice {
    private long id;
    private String nameOffice;
    private String addressOffice;
    private boolean statusOffice;
    private boolean canPlaceAtm;
    private int numberOfATMs;
    private boolean canProvideCredit;
    private boolean worksForWithdrawal;
    private boolean acceptsDeposits;
    private double moneyInOffice;
    private double rentCost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOffice() {
        return nameOffice;
    }

    public void setNameOffice(String nameOffice) {
        this.nameOffice = nameOffice;
    }

    public String getAddressOffice() {
        return addressOffice;
    }

    public void setAddressOffice(String addressOffice) {
        this.addressOffice = addressOffice;
    }

    public boolean getStatusOffice() {
        return statusOffice;
    }

    public void setStatusOffice(boolean statusOffice) {
        this.statusOffice = statusOffice;
    }

    public boolean isCanPlaceAtm() {
        return canPlaceAtm;
    }

    public void setCanPlaceAtm(boolean canPlaceAtm) {
        this.canPlaceAtm = canPlaceAtm;
    }

    public int getNumberOfATMs() {
        return numberOfATMs;
    }

    public void setNumberOfATMs(int numberOfATMs) {
        this.numberOfATMs = numberOfATMs;
    }

    public boolean isCanProvideCredit() {
        return canProvideCredit;
    }

    public void setCanProvideCredit(boolean canProvideCredit) {
        this.canProvideCredit = canProvideCredit;
    }

    public boolean isWorksForWithdrawal() {
        return worksForWithdrawal;
    }

    public void setWorksForWithdrawal(boolean worksForWithdrawal) {
        this.worksForWithdrawal = worksForWithdrawal;
    }

    public boolean isAcceptsDeposits() {
        return acceptsDeposits;
    }

    public void setAcceptsDeposits(boolean acceptsDeposits) {
        this.acceptsDeposits = acceptsDeposits;
    }

    public double getMoneyInOffice() {
        return moneyInOffice;
    }

    public void setMoneyInOffice(double moneyInOffice) {
        this.moneyInOffice = moneyInOffice;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    @Override
    public String toString() {
        return "BankOffice" +
               "\nid=" + id +
               ", \nnameOffice='" + nameOffice + '\'' +
               ", \naddressOffice='" + addressOffice + '\'' +
               ", \nstatusOffice=" + statusOffice +
               ", \ncanPlaceAtm=" + canPlaceAtm +
               ", \nnumberOfATMs=" + numberOfATMs +
               ", \ncanProvideCredit=" + canProvideCredit +
               ", \nworksForWithdrawal=" + worksForWithdrawal +
               ", \nacceptsDeposits=" + acceptsDeposits +
               ", \nmoneyInOffice=" + moneyInOffice +
               ", \nrentCost=" + rentCost;
    }
}
