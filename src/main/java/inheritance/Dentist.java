package inheritance;

public class Dentist extends Doctor {
    private String teethExamination;
    private String procedure;
    private String handedThePatient;

    public Dentist() {
        super();
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
