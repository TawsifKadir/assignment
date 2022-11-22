package assignment;

public class Teacher {
	private int ID;
	private String name;
	private Course course[] = new Course[50];
	private int no_of_course = 0;
	
	public Teacher(int ID,String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getID(){
		return this.ID;
	}
	public void addCourse(Course course) {
		this.course[this.no_of_course++] = course;
	}
	public void showSections() {	//show sections
		for(int i=0;i<no_of_course;i++) {
			System.out.println(course[i].getSection());
		}
	}
}
