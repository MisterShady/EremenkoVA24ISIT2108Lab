package tech.reliab.course.eremenkova.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentAccount {
    private long id;
    private User user;
    private String bankName;
    private double balance;



    @Override
    public String toString() {
        return
                "\nid=" + id +
                ", \nuserId=" + user.getId() +
                ", \nbankName='" + bankName + '\'' +
                ", \nbalance=" + balance;
    }
}
