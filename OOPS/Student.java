public class Student {

    private int marks;   // hidden data

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Getter
    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student student = new Student();
        
        student.setMarks(85); // Valid marks
        System.out.println("Marks: " + student.getMarks()); // Output: Marks: 85

        student.setMarks(150); // Invalid marks
        System.out.println("Marks: " + student.getMarks()); // Output: Marks: 85 (unchanged)
    }
}
