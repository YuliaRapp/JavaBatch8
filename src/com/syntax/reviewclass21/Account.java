package com.syntax.reviewclass21;

public class Account {

    double funds;
    Account(double funds){
        this.funds=funds;
    }

    public void withdrawFunds(double fundsToWithdraw) throws LowFundsException {
        if(fundsToWithdraw>funds){
            throw new LowFundsException("The funds in your account are not sufficient");

        }else {
            funds=funds-fundsToWithdraw;
            System.out.println("Successful");
        }
    }
}
