import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Contract implements Storable {
    Course[] courses;
    private int numberOfCourses;

    public Contract(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
        courses = new Course[numberOfCourses];
    }
    public void addCourse(Course course) {
        for (int i = 0; i < numberOfCourses; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
    }

    public void deleteCourse(Course.Type type, Course.Stream stream, String name) {
        for (int i = 0; i < numberOfCourses; i++) {
            if (courses[i].getType() == type && courses[i].getStream() == stream && courses[i].getName() == name) {
                courses[i] = null;
                return;
            }
        }
    }


    public void display() {
        System.out.println("Your contract:\n-----------------");
        for (int i = 0; i < numberOfCourses; i++) {
            if (courses[i] != null) {
                System.out.print(courses[i] + ", ");
            }
        }
        System.out.println("\n-----------------");
    }

    public void store(String file) {
        try (FileWriter fileWriter = new FileWriter(file);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (int i = 0; i < numberOfCourses; i++) {
                if(courses[i] != null)
                    printWriter.println(courses[i]);
            }
            System.out.println("Courses saved to " + file);
        } catch (IOException e) {
            System.err.println("Error while saving the course's contents to " + file);
        }
    }
}
