package inheritance;

public class Doctor extends Profession {
    private String patientAgeGroup;

    public Doctor(String name, String surname, String education, String birthday, String patientAgeGroup) {
        super(name, surname, education, birthday);
        this.patientAgeGroup = patientAgeGroup;
    }

    public String getPatientAgeGroup;

    public String setPatientAgeGroup(String patientAgeGroup) {
        this.patientAgeGroup = patientAgeGroup;
        return patientAgeGroup;
    }
}

