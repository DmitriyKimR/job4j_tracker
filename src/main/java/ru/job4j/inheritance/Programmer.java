package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname,
                      String education, String birthday, String industry, String language) {
        super(name, surname, education, birthday, industry);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String setLanguage(String language) {
        this.language = language;
        return language;
    }
}
