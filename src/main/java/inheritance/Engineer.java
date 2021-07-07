package inheritance;

public class Engineer extends Profession {
    private String industry;
    private String speciality;

    public Engineer(String name, String surname, String education, String birthday, String industry, String speciality) {
        super(name, surname, education, birthday);
        this.industry = industry;
        this.speciality = speciality;
    }

    public String getIndustry;
    public String getSpeciality;

    public String setIndustry(String industry) {
        this.industry = industry;
        return industry;
    }

    public String setSpeciality(String speciality) {
        this.speciality = speciality;
        return speciality;
    }
}
