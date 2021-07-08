package inheritance;

public class Surgeon extends Doctor {
    private String referral;

    public Surgeon(String name, String surname, String education, String birthday, String patientAgeGroup, String referral) {
        super(name, surname, education, birthday, patientAgeGroup);
        this.referral = referral;

    }

    public String getReferral;

    public String setReferral(String referral) {
        this.referral = referral;
        return referral;
    }
}
