package assignment;

public class Course {
	private String Course_name;
	private int Section;
	private int Time;
	private Teacher Teacher;
	private Student Student_List[] = new Student[50]; 
	private int Student_no = 0;
	private Course[] courses = new Course[50];
	public Course(String Course_name,int Section,int Time) {
		this.Course_name = Course_name;
		this.Section = Section;
		this.Time = Time;
		//this.Teacher = Teacher;
	}
	
	public void add_Teacher(Teacher teacher) {
		teacher.addCourse(new Course(this.Course_name,this.Section,this.Time));
	}
	
	public void add_Student(Student student) {	//add student to this course
		
		courses = student.getCourseList();
		boolean check = true;
		for(int i=0;i<student.getCourse_no();i++) {
			if(courses[i].getTime() == this.Time) {
				System.out.println("Time Clash");
				check = false;
				break;
			}
		}
		if(check) {
			this.Student_List[this.Student_no] = student;
			this.Student_no++;
			Course c1 = new Course(this.Course_name,this.Section,this.Time);
			student.addCourse(c1);
			System.out.printf("Student %s added\n",student.getName());
		}
	}
	
	public void show_StudentList() {	//show students enrolled in this course
		for(int i=0;i<this.Student_no;i++) {
			System.out.println(Student_List[i].getName());
		}
	}
	
	public int getTime() {
		return this.Time;
	}
	public void show() {
		
		System.out.printf("%s		%d		%s		%s\n",this.Course_name,this.Section,this.Time,this.Teacher.getName());
		show_StudentList();
	}
	public String getCourseName(){
		return this.Course_name;
	}	
	public int getSection() {
		return this.Section;
	}
	public String getTeacher() {
		return this.Teacher.getName();
	}
}
