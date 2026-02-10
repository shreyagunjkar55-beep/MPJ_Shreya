import java.util.Scanner;
class Student {
   // Private data members
   private String name;
   private int rollNo;
   private int[] marks = new int[5];
   // Constructor
   public Student(String name, int rollNo, int[] marks) {
       this.name = name;
       this.rollNo = rollNo;
       this.marks = marks;
   }
   // calculate average marks
   public double calculateAverage() {
       int sum = 0;
       for (int m : marks) {
           sum += m;
       }
       return sum / 5.0;
   }
   //calculate grade
   public char calculateGrade() {
       double avg = calculateAverage();
       if (avg >= 75) {
           return 'A';
       } else if (avg >= 60) {
           return 'B';
       } else {
           return 'C';
       }
   }
   public void display() {
       System.out.println("\nStudent Details");
       System.out.println("Name      : " + name);
       System.out.println("Roll No   : " + rollNo);
       System.out.println("Average   : " + calculateAverage());
       System.out.println("Grade     : " + calculateGrade());
   }
}
public class StudentGrade {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Name: ");
       String name = sc.nextLine();
       System.out.print("Enter Roll Number: ");
       int rollNo = sc.nextInt();
       int[] marks = new int[5];
       System.out.println("Enter marks for 5 subjects:");
       for (int i = 0; i < 5; i++) {
           marks[i] = sc.nextInt();
       }
       Student s = new Student(name, rollNo, marks);
       s.display();
       sc.close();
   }
}
