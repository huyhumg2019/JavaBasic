package quanly.sinhvien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private static final String STUDENT_FILE_NAME= "text.txt";
	
	public void write(List<Student> studentlist)  {
		
		FileOutputStream fileOutputStream = null ;
		ObjectOutputStream objectOutputStream =null;
		if(fileOutputStream== null) {
			try {
				fileOutputStream =new FileOutputStream(new File(STUDENT_FILE_NAME));
				objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(studentlist);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			close(objectOutputStream);
			close(fileOutputStream);
		}
		
		
		
	}
	public List<Student> read()  {
		List<Student> students  = new ArrayList<>();
		FileInputStream fileInputStream  = null;
		ObjectInputStream objectInputStream =null;
		if(fileInputStream==null) {
		 try {
			fileInputStream  = new FileInputStream(new File(STUDENT_FILE_NAME));
			objectInputStream = new ObjectInputStream(fileInputStream);
			students =(List<Student>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 close(fileInputStream);
		 close(objectInputStream);
		}
		return students;
		
		
	}
	private void close(InputStream is) {
		if (is!=null) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private void close(OutputStream os) {
		if(os!=null) {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
