package inheritance;

public class Surgeon extends Doctor {
    private String listenPatient;
    private String examines;
    private String heal;

    public Surgeon() {
        super();
    }

    public String getListenPatient;
    public String getExamines;
    public String getHeal;

    public String setListenPatient(String listenPatient) {
        this.listenPatient = listenPatient;
        return listenPatient;
    }

    public String setExamines(String examines) {
        this.examines = examines;
        return examines;
    }

    public String setHeal(String heal) {
        this.heal = heal;
        return heal;
    }
}
