public class Student {
    int studentId;
    String name;
    String group;

    public Student(int studentId, String name, String group) {
        this.studentId = studentId;
        this.name = name;
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return getName();
    }
}