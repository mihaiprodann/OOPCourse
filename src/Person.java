public class Person {

    private final String name;
    private final boolean gender; // 1 - male, 0 - female
    private final String jobDescription;
    private final int experience;
    private final String location;

    public Person(String name, boolean gender, String jobDescription, int experience, String location) {
        this.name = name;
        this.gender = gender;
        this.jobDescription = jobDescription;
        this.experience = experience;
        this.location = location;
    }

    @Override
    public String toString() {
        String result;
        result  = "Name: " + name + "\n";
        result += gender ? "Gender: Male" + "\n" : "Gender: Female" + "\n";
        result += "Job Description: " + jobDescription + "\n";
        result += "Experience: " + experience + "\n";
        result += "Location: " + location + "\n";
        return result;
    }
}
