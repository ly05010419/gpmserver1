import com.management.server1.Student;
import com.management.server1.StudentDao;

public class ApprovalService {

	StudentDao userDao = new StudentDao();

	public String isApproved(String studentId) {

		Student student = userDao.getStudentById(studentId);

		String passed_practice_project = student.getPassed_practice_project();

		System.out.println("SoapService: isApproved wurde zugegriffen!" + " studentId:" + studentId
				+ ",erfolgreich bekommen" + " passed_practice_project:" + passed_practice_project + ", geben");

		return passed_practice_project;

	}
}
