package assignment;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course Course_List[] = new Course[50];
		int Course_no = 3;
		Scanner sc = new Scanner(System.in);
		Teacher T1 = new Teacher(1122,"Jakir");
		Teacher T2 = new Teacher(1132,"Jaki");
		Teacher T3 = new Teacher(1142,"Jak");
		Course_List[0] = new Course("CSE115",17,1230);
		Course_List[1] = new Course("CSE215",10,1230);
		Course_List[2] = new Course("CSE225",13,1230);
		
		Student s1 = new Student(22444,"Rafi");
		Student s2 = new Student(22445,"Aiman");
		Student s3 = new Student(22446,"Nahian");
		
		Course_List[0].add_Student(s1);
		Course_List[2].add_Student(s2);
		Course_List[1].add_Student(s3);
		
		Course_List[1].add_Teacher(T1);
		Course_List[0].add_Teacher(T1);
		//for(int i=0;i<3;i++) {
		//	Course_List[i].show();
		//}
		T1.showSections();
		/*
		System.out.print("Enter number of courses: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter course name: ");
			String Course_name = sc.next();
			System.out.print("Enter Teacher name: ");
			String Teacher_Name = sc.next();
			System.out.print("Enter Section: ");
			int Section = sc.nextInt();
			System.out.print("Enter Teacher ID: ");
			int ID = sc.nextInt();
			Teacher T1 = new Teacher(ID,Teacher_Name);
			System.out.print("Enter Timing: ");
			String Timing = sc.next();
			Course_List[Course_no++] = new Course(Course_name,Section,Timing,T1);
		}
		*/
		/*
		System.out.println("Course		Section		Timing		Teacher");
		for(int j=0;j<Course_no;j++) {
			Course_List[j].show();
		}*/
		sc.close();

	}
	

}
