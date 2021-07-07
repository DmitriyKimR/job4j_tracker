package inheritance;

public class Doctor extends Profession {
    private String patientAgeGroup;
    private String referral;
    private int age;

    public Doctor(String name, String surname, String education, String birthday, String patientAgeGroup, String referral, int age) {
        super(name, surname, education, birthday);
        this.patientAgeGroup = patientAgeGroup;
        this.referral = referral;
        this.age = age;
    }

    public String getPatientAgeGroup;
    public String getReferral;
    public int getAge;

    public String setPatientAgeGroup(String patientAgeGroup) {
        this.patientAgeGroup = patientAgeGroup;
        return patientAgeGroup;
    }

    public String setReferral(String referral) {
        this.referral = referral;
        return referral;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }
}

