public class Student {

    private int marks;


    //setter
    public  void setMarks(int marks) {

        if(marks>0 && marks<=100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
        
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        
        Student student = new Student();
        student.setMarks(85);
        System.out.println("Student marks: " + student.getMarks());

        student.setMarks(150); // Invalid marks
        System.out.println("Student marks: " + student.getMarks());
    }
    
}
