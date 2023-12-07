import java.util.List;

public class Course {
    int courseId;
    int creditPoints;
    int year;
    String fullName;

    public Course(int courseId, int creditPoints, int year, String fullName) {
        this.courseId = courseId;
        this.creditPoints = creditPoints;
        this.year = year;
        this.fullName = fullName;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public int getYear() {
        return year;
    }

    public String getFullName() {
        return fullName;
    }

}