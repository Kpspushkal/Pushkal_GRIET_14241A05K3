package epam;


import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

	public static void main(String[] args) {
            String expectedPattern = "yyyy-MM-dd";
    SimpleDateFormat sdf = new SimpleDateFormat(expectedPattern);
    java.util.Date yourDate = null ;
            try {
                yourDate = sdf.parse("1992-07-26");
                Date yourDate1 = sdf.parse("1992-07-26");
            } catch (ParseException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    
		Student[] students=new Student[2];
                students[0]=new Student(55,"Pushkal k",yourDate,945);
            Date yourDate1 = null;
                students[1]=new Student(5,"Pshkal k",yourDate1,95);
                StudentGroup sg=new StudentGroup(4);
                sg.getStudent(0);
    
           // Student s=new Student(51,"Pushkal k","1996-12-05",945);
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
