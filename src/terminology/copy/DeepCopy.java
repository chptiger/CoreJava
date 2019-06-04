package terminology.copy;

/**
 * Deep copy of an object will have exact copy of all the fields of original
 * object just like shallow copy. But in additional, if original object has any
 * references to other objects as fields, then copy of those objects are also
 * created by calling clone() method on them. That means clone object and
 * original object will be 100% disjoint. They will be 100% independent of each
 * other. Any changes made to clone object will not be reflected in original
 * object or vice-versa.
 * 
 * To create a deep copy of an object, you have to override the clone() method
 * as demonstrated in the below example.
 * 
 * E.X
 * StudentDeepCopy override the clone method, CourseDeepCopy implements Cloneable interface.
 * CourseDeepCopy is a references type in StudentDeepCopy, after override the clone method.
 * CourseDeepCopy in student1 and student2 are totally dependent. 
 * the update of CourseDeepCopy in the student1 will not update CourseDeepCopy in the student2.
 *
 */
class CourseDeepCopy implements Cloneable { // The objects which implement Cloneable interface are only eligible for cloning process.
	String subject1;
	String subject2;
	String subject3;

	public CourseDeepCopy(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class StudentDeepCopy implements Cloneable {
	int id;
	String name;
	CourseDeepCopy course;

	public StudentDeepCopy(int id, String name, CourseDeepCopy course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		StudentDeepCopy student = (StudentDeepCopy) super.clone();
		student.course = (CourseDeepCopy) course.clone();
		return student;
	}
}

public class DeepCopy {
	public static void main(String[] args) {
		CourseDeepCopy science = new CourseDeepCopy("Physics", "Chemistry", "Biology");
		StudentDeepCopy student1 = new StudentDeepCopy(111, "John", science);
		StudentDeepCopy student2 = null;

		try {
			// Creating a clone of student1 and assigning it to student2
			student2 = (StudentDeepCopy) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'
		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'
		student2.course.subject3 = "Maths";

		// This change will not be reflected in original student 'student1'
		System.out.println(student1.course.subject3); // Output : Biology
	}
}
