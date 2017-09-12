import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
                 int lenth=length;
	}

	@Override
	public Student[] getStudents() {
            for(int i=0;i<lenth;i++)
            {
                System.out.println(students.getId());
                System.out.println(students.getFullname());
                System.out.println(students.getBirthDate());
                System.out.println(students.getavgMark());
                
            }
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
            for(int i=0;i<length;i++)
            {
                students.setId();
                students.setFullname();
                students.setId();
                students.setavgMark();
                
            }
            
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
            System.out.println(students[index].getId());
                System.out.println(students[index].getFullname());
                System.out.println(students[index].getBirthDate());
                System.out.println(students[index].getavgMark());
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
            students[index].setId();
                students[index].setFullname();
                students[index].setId();
                students[index].setavgMark();

		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
            students[0].setId();
                students[0].setFullname();
                students[0].setId();
                students[0].setavgMark();

		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
            students[length].setId();
                students[length].setFullname();
                students[length].setId();
                students[length].setavgMark();
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		students[index].setId();
                students[index].setFullname();
                students[index].setId();
                students[index].setavgMark();// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
