package ru.job4j.bank;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

/**
 * class described simple bank service system
 * @author dmitrij
 * @version 1.0
 */
public class BankService {
    /**
     * data storage type HashMap
     * User is a key
     * users is a List of accounts of User
     */
    private final HashMap<User, List<Account>> users = new HashMap<>();

    /**
     * method to add a User in database if this user does not exist
     * @param user accepts new User with some name
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * method to delete User from database by passport number
     * @param passport accepts User's passport field
     * @return boolean condition true if delete was success
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * method adds an new account to User if User exist in database, and he hasn't such account
     * @param passport accepts User's field passport
     * @param account accepts account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * method finds a User in database by passport number
     * @param passport accepts string of number characters for search
     * @return User if he exists in database
     */
    public User findByPassport(String passport) {
        User userFind = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userFind = user;
                break;
            }
        }
        return userFind;
    }

    /**
     * method finds an User's account in database
     * @param passport accepts number of User's passport
     * @param requisite accepts number of User's account
     * @return User's account if it exists it database
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account requisiteAccount = null;
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    requisiteAccount = account;
                    break;
                }
            }
        }
        return requisiteAccount;
    }

    /**
     * method transfers the money
     * @param srcPassport accepts source User's passport number
     * @param srcRequisite accepts source User's account number
     * @param destPassport accepts destination User's passport number
     * @param destRequisite accepts destination User's account number
     * @param amount accepts amount for transfer
     * @return transfer boolean condition
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account destination = findByRequisite(destPassport, destRequisite);
        if (source != null && amount > 0
                && source.getBalance() >= amount && destination != null) {
                source.setBalance(source.getBalance() - amount);
                destination.setBalance(destination.getBalance() + amount);
                result = true;
        }
        return result;
    }

    /**
     * method shows all User's accounts
     * @param user accepts User
     * @return List of accounts
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
