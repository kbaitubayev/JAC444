package student;

public class Student {
	
	// Fields
		private String firstName;
		private String lastName;
		private double grade;
		private String department;

		// Constructor
		public Student(String firstName, String lastName, double grade, String department) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setGrade(grade);
			this.setDepartment(department);
		}
		// Full Name
		public String getName() {
			return getFirstName() + " " + getLastName();
		}
		
		// fistName
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getFirstName() {
			return firstName;
		}

		// lastName
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getLastName() {
			return lastName;
		}

		// grade
		public void setGrade(double grade) {
			this.grade = grade;
		}

		public double getGrade() {
			return grade;
		}

		// department
		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDepartment() {
			return department;
		}
		
		public boolean isGradeinRange50And100() {
			if (getGrade() >= 50.0 && getGrade() <= 100.0) {
				return true;
			} else {
				return false;
			}
			
			
		}	
		
		// ToString
		@Override
		public String toString() {
			return String.format("%-9s%-9s%8.2f   %s", getFirstName(), getLastName(), getGrade(), getDepartment());
		}

}
