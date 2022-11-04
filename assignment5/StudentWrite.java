package student;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentWrite {
	
	public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        boolean outerFlag = true;

        ArrayList<Student> students = new ArrayList<Student>();

        while (outerFlag) {
        	Student student = new Student();

            System.out.println("<---STUDENT INFORMATION BEFORE--->");
            System.out.println(student.toString() + "\n");

            System.out.println("Please enter new student information." + "\n");

            System.out.println("Enter Student ID: ");
            student.setStdID(sc.nextInt());

            System.out.println("Enter First Name: ");
            student.setFirstName(sc.next());

            System.out.println("Enter Last Name: ");
            student.setLastName(sc.next());

            System.out.println("Enter Courses: (type '0' to stop adding courses)");
            boolean innerFlag = true;

            while (innerFlag) {
                String course = sc.next();

                if (!course.equals("0")) {
                    student.addCourse(course);
                  
                } else {
                    innerFlag = false;
                    System.out.println("\n");
                }
            }
            students.add(student);

            System.out.println("STUDENT INFORMATION:");
            System.out.println(student.toString() + "\n");

            System.out.println("Add another Student? (yes/no)");
            String choice = sc.next();

            if (choice.equals("no")) {
                outerFlag = false;
            }
        }
         try {
             FileOutputStream fos = new FileOutputStream("testFile");
             ObjectOutputStream oos = new ObjectOutputStream(fos);

             oos.writeObject(students);

             oos.flush();
             fos.close();

             System.out.println("<---WRITE STUDENT INFORMATION-->");
             for (int i = 0; i < students.size(); i++) {
                 System.out.println("\n" + students.get(i).toString());
             }
         } catch (Throwable e) {
             System.err.println(e);
         }
    }

}
