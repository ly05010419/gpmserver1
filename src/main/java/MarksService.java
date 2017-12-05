
import com.management.server1.StudentDao;

public class MarksService {
	
	StudentDao userDao = new StudentDao();
	
	public void updateStudentById(String studentId, String passed_colloquium, String passed_bachelor_thesis) {
		
		
		userDao.updateStudentById(studentId, passed_colloquium, passed_bachelor_thesis);


		System.out.println("SoapService: enterMarks wurde zugegriffen!" + " studentId:" + studentId
				+ ",erfolgreich bekommen");
	}
	
}
