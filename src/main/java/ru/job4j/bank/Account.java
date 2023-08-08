package ru.job4j.bank;

import java.util.Objects;

/**
 * this class is model of a bank account
 * @author dmitrij
 * @version 1.0
 */
public class Account {
    /**
     * bank account fields
     * requisite includes unique string of number characters
     * field balance includes information of account balance
     */
    private String requisite;
    private double balance;

    /**
     * account model constructor
     * @param requisite accepts unique string of number characters
     * @param balance accepts starting balance of account
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
