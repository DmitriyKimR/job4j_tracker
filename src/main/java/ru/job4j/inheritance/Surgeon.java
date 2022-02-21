package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String referral;

    public Surgeon(String name, String surname, String education,
                   String birthday, String ageGroup, String referral) {
        super(name, surname, education, birthday, ageGroup);
        this.referral = referral;

    }

    public String getReferral() {
        return referral;
    }

    public String setReferral(String referral) {
        this.referral = referral;
        return referral;
    }
}
