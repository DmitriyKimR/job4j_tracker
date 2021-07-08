package inheritance;

public class Dentist extends Doctor {
    private String procedure;

    public Dentist(String name, String surname, String education, String birthday, String patientAgeGroup, String procedure) {
        super(name, surname, education, birthday, patientAgeGroup);
        this.procedure = procedure;
    }

    public String getProcedure() {
        return procedure;
    }

    public String setProcedure(String procedure) {
        this.procedure = procedure;
        return procedure;
    }
}
