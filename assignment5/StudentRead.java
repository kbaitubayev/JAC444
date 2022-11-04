package student;

import java.io.*;
import java.util.ArrayList;

public class StudentRead {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            FileInputStream fis = new FileInputStream("testFile");
            ObjectInputStream ois = new ObjectInputStream(fis);

            students = (ArrayList<Student>) ois.readObject();

            fis.close();
        }
        catch (Throwable e) {
            System.err.println(e);
        }
        System.out.println("READ STUDENT INFORMATION");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\n" + students.get(i).toString());
        }
    }
	
}
