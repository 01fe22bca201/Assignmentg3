import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dob.getYear();
        if (currentDate.getMonthValue() < dob.getMonthValue() ||
                (currentDate.getMonthValue() == dob.getMonthValue() && currentDate.getDayOfMonth() < dob.getDayOfMonth())) {
            age--;
        }
        System.out.println("Age: " + age);
    }
}
