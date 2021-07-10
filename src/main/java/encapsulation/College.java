package encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kim Dmitri");
        student.setGroup("Beginner");
        student.setEntry(new Date());
        System.out.println(student.getName() + " studying on a " + student.getGroup() + " now at " + student.getEntry());
    }
}
