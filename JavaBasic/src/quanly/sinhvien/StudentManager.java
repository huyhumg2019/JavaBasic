package quanly.sinhvien;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	public static  Scanner scanner = new Scanner(System.in);
	private List<Student> Lstudents;
	private StudentDao studentDao;
	public StudentManager() {
		studentDao = new StudentDao();
		Lstudents=studentDao.read();
	}
	public void add() {
		int id = (Lstudents.size()>0)?(Lstudents.size()+1):1;
		System.out.println("Student id ="+id);
		String name = inputName();
		String address = inputAddress();
		int age = inputAge();
		float gpa = inputGpa();
		Student student = new Student(id, age, name, address, gpa);
		Lstudents.add(student);
		studentDao.write(Lstudents);
		
	}
	public void edit (int id ) {
		boolean ischeck=false;
	
			for (int i = 0; i < Lstudents.size(); i++) {
				if(Lstudents.get(i).getId()==id) {
				ischeck=true;
					Lstudents.get(i).setName(inputName());
					Lstudents.get(i).setAge(inputAge());
					Lstudents.get(i).setAddress(inputAddress());
					Lstudents.get(i).setGpa(inputGpa());
					break;
				}
				
		
		}
			if(ischeck==false) {
				System.out.println("id ko ton tai");
			}else {
			studentDao.write(Lstudents);}
	}
	public void delete (int id ) {
		Student student=null;
		for (int i = 0; i < Lstudents.size(); i++) {
			if(Lstudents.get(i).getId()==id) {
				student=Lstudents.get(i);
				Lstudents.remove(student);
				
			}
			
		}if(student!=null) {
			studentDao.write(Lstudents);
		}else {System.out.println("id ko ton tai");
			
		}
		
	}
	public void SortStudentByGpa() {
		Collections.sort(Lstudents, new SortStudentByGPA());
	}
	public void SortStudentByname() {
		Collections.sort(Lstudents, new SortStudentByName());
	}
	int inputID() {
		System.out.println("Nhap id can edit:");
		return Integer.parseInt(scanner.nextLine());
	}
	private float inputGpa() {
		System.out.println("Nhap GPa : ");
		float gpa = Float.parseFloat(scanner.nextLine());
		return gpa;
	}
	private int inputAge() {
		System.out.println("Nhap AGE : ");
		int age = Integer.parseInt(scanner.nextLine());
		return age;
	}
	private String inputAddress() {
		System.out.println("Nhap ADDRESS : ");
		return scanner.nextLine();
	}
	private String inputName() {
		System.out.println("Nhap Ten : ");
		return scanner.nextLine();
	}
	public void show() {
        for (Student student : Lstudents) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
//            %c	ký tự
//            %d	số thập phân
//            %e	số thực dạng khoa học (3.000000e+11)
//            %f	số thực
//            %i	số nguyên
//            %o	số cơ số 8
//            %s	chuỗi
//            %u	số thập phân không dấu
//            %x	số cơ số 16
//            %%	biểu diễn %
//            \%	biểu diễn %
//            \n	Ký tự xuống dòng
        	
        }
    }


}
