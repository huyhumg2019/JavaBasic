package quanly.sinhvien;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	private static String check = null;
	private boolean exit = false;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager  manager = new StudentManager();
		showMenu();
		boolean exit = false;

		while(true) {
			check = scanner.nextLine();
			switch (check) {
			case "1":
				
				manager.add();
			
				
				break;
			case "2":
				
				manager.edit(manager.inputID());
				break;
			case "3":
				manager.delete(manager.inputID());
				break;
			case "4":
				manager.SortStudentByGpa();
				manager.show();
				break;
			case "5":
				manager.SortStudentByname();
				manager.show();
				
				break;
			case "6":
				
					manager.show();
				break;

			default:
				System.out.println("invalid! please choose action in below menu:");
				showMenu();


				break;
				
			}
			
			

			
		}
		

	}
	public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }


}
