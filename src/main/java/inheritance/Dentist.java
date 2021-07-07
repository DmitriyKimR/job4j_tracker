package inheritance;

public class Dentist extends Doctor {
    private String teethExamination;
    private String procedure;
    private String handedThePatient;

    public Dentist(String name, String surname, String education, String birthday, String patientAgeGroup, String referral, int age, String teethExamination, String procedure, String handedThePatient) {
        super(name, surname, education, birthday, patientAgeGroup, referral, age);
        this.teethExamination = teethExamination;
        this.procedure = procedure;
        this.handedThePatient = handedThePatient;

    }

    public String getTeethExamination;
    public String getProcedure;
    public String getHandedThePatient;

    public String setTeethExamination(String teethExamination) {
        this.teethExamination = teethExamination;
        return teethExamination;
    }

    public String setProcedure(String procedure) {
        this.procedure = procedure;
        return procedure;
    }

    public String setHandedThePatient(String handedThePatient) {
        this.handedThePatient = handedThePatient;
        return handedThePatient;
    }

}
