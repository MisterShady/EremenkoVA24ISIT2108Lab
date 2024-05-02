package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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



    @Override
    public String toString() {
        return
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
