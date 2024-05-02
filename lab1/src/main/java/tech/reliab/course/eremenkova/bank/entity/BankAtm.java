package tech.reliab.course.eremenkova.bank.entity;

public class BankAtm {
    private long id;
    private String name;
    private String addressAtm;
    private boolean statusAtm;
    private Bank bank;
    private BankOffice bankOffice;
    private Employee serviceEmployee;
    private boolean worksForWithdrawal;
    private boolean acceptsDeposits;
    private double moneyInAtm;
    private double maintenanceCost;


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

    public String getAddressAtm() {
        return addressAtm;
    }

    public void setAddressAtm(String addressAtm) {
        this.addressAtm = addressAtm;
    }

    public boolean getStatusAtm() {
        return statusAtm;
    }

    public void setStatusAtm(boolean statusAtm) {
        this.statusAtm = statusAtm;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankOffice getBankOffice() {
        return bankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public Employee getServiceEmployee() {
        return serviceEmployee;
    }

    public void setServiceEmployee(Employee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
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

    public double getMoneyInAtm() {
        return moneyInAtm;
    }

    public void setMoneyInAtm(double moneyInAtm) {
        this.moneyInAtm = moneyInAtm;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    @Override
    public String toString() {
        return "BankAtm" +
               " \nid=" + id +
               ", \nname='" + name + '\'' +
               ", \naddressAtm='" + addressAtm + '\'' +
               ", \nstatusAtm=" + statusAtm +
               ", \nbankId=" + bank.getId() +
               ", \nbankOfficeId=" + bankOffice.getId() +
               ", \nserviceEmployeeId=" + serviceEmployee.getId() +
               ", \nworksForWithdrawal=" + worksForWithdrawal +
               ", \nacceptsDeposits=" + acceptsDeposits +
               ", \nmoneyInAtm=" + moneyInAtm +
               ", \nmaintenanceCost=" + maintenanceCost;
    }
}
