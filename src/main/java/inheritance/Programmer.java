package inheritance;

public class Programmer extends Engineer {
    private String backend;
    private String technology;
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String industry, String speciality, String backend, String technology, String language) {
        super(name, surname, education, birthday, industry, speciality);
        this.backend = backend;
        this.technology = technology;
        this.language = language;
    }

    public String getBackend;
    public String getTechnology;
    public String getLanguage;

    public String setBackend(String backend) {
        this.backend = backend;
        return backend;
    }

    public String setTechnology(String technology) {
        this.technology = technology;
        return technology;
    }

    public String setLanguage(String language) {
        this.language = language;
        return language;
    }
}
