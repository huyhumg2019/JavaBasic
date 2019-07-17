package quanly.sinhvien;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		if(student1.getGpa()>student2.getGpa()) {
			return 1;
		}
		return -1;
		//return 0 neu bang nhau
	}

}
