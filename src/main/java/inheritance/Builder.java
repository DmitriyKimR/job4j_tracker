package inheritance;

public class Builder extends Engineer {
    private String speciality;

    public Builder(String name, String surname, String education,
                   String birthday, String industry, String speciality) {
        super(name, surname, education, birthday, industry);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String setSpeciality(String speciality) {
        this.speciality = speciality;
        return speciality;
    }
}
