package inheritance;

public class Builder extends Engineer {
    private String industrial;
    private String mason;

    public Builder(String name, String surname, String education, String birthday, String industry, String speciality, String industrial, String mason) {
        super(name, surname, education, birthday, industry, speciality);
        this.industrial = industrial;
        this.mason = mason;
    }

    public String getIndustrial;
    public String getMason;

    public String setIndustrial(String industrial) {
        this.industrial = industrial;
        return industrial;
    }

    public String setMason(String mason) {
        this.mason = mason;
        return mason;
    }
}
