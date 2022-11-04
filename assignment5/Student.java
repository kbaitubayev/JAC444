package student;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields
	private int stdID;
	private String firstName;
	private String lastName;
	private List<String> courses;

	// Constructors
	public Student() {
		courses = new ArrayList<>();
	}

	public Student(int stdID, String firstName, String lastName, List<String> courses) {
		this.stdID = stdID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
	}

	// StdID
	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) throws Exception {
		if (stdID > 0) {
			this.stdID = stdID;
		} else {
			throw new Exception("Invalid Student ID!");
		}
	}

	// firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Courses
	public List<String> getCourses() {
		return courses;
	}

	public void addCourse(String course) {
		this.courses.add(course);
	}

	public void setCourses(List<String> courses) throws Exception {
		if (courses.size() != 0) {
			this.courses = courses;
		} else {
			throw new Exception("Invalid Courses!");
		}
	}
	@Override
    public String toString() {
        return "Student ID: " + getStdID()
                + "\nFirst Name: " + getFirstName()
                + "\nLast Name: " + getLastName()
                + "\nCourse: " + getCourses();
    }
}
