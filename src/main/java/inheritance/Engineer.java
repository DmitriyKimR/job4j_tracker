package inheritance;

public class Engineer extends Profession {
    private String industry;

    public Engineer(String name, String surname,
                    String education, String birthday, String industry) {
        super(name, surname, education, birthday);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public String setIndustry(String industry) {
        this.industry = industry;
        return industry;
    }
}
