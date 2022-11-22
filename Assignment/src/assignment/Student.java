package assignment;

public class Student {
	private int ID;
	private String name;
	private Course[] Enrolled_Courses = new Course[50];
	private int Course_no = 0;
	
	public Student(int ID,String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getID() {
		return this.ID;
	}
	public void addCourse(Course course) {	//add courses
		this.Enrolled_Courses[Course_no++] = course;
	}
	
	public Course[] getCourseList() {
		return this.Enrolled_Courses;
	}
	public int getCourse_no() {
		return Course_no;
	}
	
	public void showCourses() {		//show registered courses
		System.out.println("Course		Section		Timing		Teacher");
		Course course;
		for(int i=0;i<Course_no;i++) {
			course = Enrolled_Courses[i];
			System.out.printf("%s		%d		%d		%s\n",course.getCourseName(),course.getSection(),course.getTime(),course.getTeacher());
		}
	}
}
