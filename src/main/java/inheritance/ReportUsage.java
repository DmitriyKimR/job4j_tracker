package inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JsonReport report = new JsonReport();
        String text = report.generate("name", "body");
        System.out.println(text);
    }
}
