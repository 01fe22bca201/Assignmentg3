public class StudentCourses {
    private String semester;
    private String[] courses;
    private int[] marks;

    public StudentCourses(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Marks: " + marks[i]);
        }
    }
}
