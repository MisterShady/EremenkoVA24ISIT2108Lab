package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankOffice {
    private long id;
    private String nameOffice;
    private String addressOffice;
    private boolean statusOffice;
    private boolean canPlaceAtm;
    private boolean canProvideCredit;
    private boolean worksForWithdrawal;
    private boolean acceptsDeposits;
    private double moneyInOffice;
    private double rentCost;


    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nnameOffice='" + nameOffice + '\'' +
                ", \naddressOffice='" + addressOffice + '\'' +
                ", \nstatusOffice=" + statusOffice +
                ", \ncanPlaceAtm=" + canPlaceAtm +
                ", \ncanProvideCredit=" + canProvideCredit +
                ", \nworksForWithdrawal=" + worksForWithdrawal +
                ", \nacceptsDeposits=" + acceptsDeposits +
                ", \nmoneyInOffice=" + moneyInOffice +
                ", \nrentCost=" + rentCost;
    }
}
