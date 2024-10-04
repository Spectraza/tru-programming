public class Course {
    int courseCode;
    String courseName;
    int courseHours;

    Course(int courseCode, String courseName, int courseHours){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseHours = courseHours;
    }
    void display(){
        System.out.println("Course Name: "+courseName+ "; Course Code: " +courseCode+ "; Course Hours: " +courseHours);
    }
}
