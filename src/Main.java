import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public List<Integer> exercise1(List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
    }

    public int exercise2(List<Integer> numbers) {
        return numbers.stream()
            .map(n -> n * n)
            .reduce(0, Integer::sum);
    }

    public Map<String, Integer> exercise3a(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(String::valueOf, String::length));
    }

    public Map<Integer, List<String>> exercise3b(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public List<String> exercise4(List<String> strings) {
        return strings.stream()
                .flatMap(string -> Stream.of(string.split(" ")))
                .distinct()
                .collect(Collectors.toList());
    }

    public String exercise5(List<Student> students, String group) {
        return students.stream()
                .filter(student -> student.group.equals(group))
                .map(student -> student.name)
                .collect(Collectors.joining(", "));
    }


    public List<Integer> generateList(int size) {
        return Stream.iterate(0, i -> i + 1)
                .limit(size)
                .collect(Collectors.toList());
    }

    public long exercise6a(List<Integer> numbers) {
        return numbers.parallelStream()
                .mapToLong(num -> (long) num * num)
                .sum();
    }

    public long exercise6b(List<Integer> numbers) {
        return numbers.stream()
                .mapToLong(num -> (long) num * num)
                .sum();
    }

    public List<Student> exercise7(List<Student> students, List<Course> courses) {
        return students.stream()
                .filter(student -> courses.stream()
                        .filter(course -> course.getCreditPoints() >= 5)
                        .anyMatch(course -> course.getCourseId() == student.getStudentId()))
                .collect(Collectors.toList());
    }

    public List<Student> exercise8(List<Student> students, List<Course> courses) {
        return students.stream()
                .filter(student -> courses.stream()
                        .mapToInt(Course::getCreditPoints)
                        .sum() >= 30)
                .collect(Collectors.toList());
    }

    // Receive a list of courses. Return a map where the key is the course id and the value is the list of ids of the students enrolled in that course.
    public Map<Integer, List<Integer>> exercise9(List<Course> courses) {
        return courses.stream()
                .collect(Collectors.toMap(Course::getCourseId, course -> Collections.singletonList(course.getCourseId())));
    }

    // Receive a list of students and a group. Return the list of the first 5 students in the group, sorted by name.
    public List<Student> exercise10(List<Student> students, String group) {
        return students.stream()
                .filter(student -> student.getGroup().equals(group))
                .sorted(Comparator.comparing(Student::getName))
                .limit(5)
                .collect(Collectors.toList());
    }

    // Receive a list of students. Return a map where the key is the group and the value is the list of courses in which the students from the group are enrolled, with duplicates removed.
    public Map<String, List<String>> exercise11(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGroup, Collectors.mapping(Student::getName, Collectors.toList())));
    }



    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = new Main().exercise1(numbers);

        List<Integer> numbers2 = List.of(2, 2, 2);
        int result2 = new Main().exercise2(numbers2);

        List<String> strings = List.of("ana", "test", "123");
        Map<String, Integer> result3 = new Main().exercise3a(strings);
        Map<Integer, List<String>> result4 = new Main().exercise3b(strings);

        List<String> strings2 = List.of("ana", "test", "123", "ana", "test", "123", "ana test 123");
        List<String> result5 = new Main().exercise4(strings2);

        List<Student> students = List.of(
            new Student(1, "Ana", "A"),
            new Student(2, "Maria", "B"),
            new Student(3, "Ion", "A"),
            new Student(4, "Gheorghe", "C"),
            new Student(5, "😘Vasile", "A")
        );
        String result6 = new Main().exercise5(students, "A");

        long startTimeParallel = System.currentTimeMillis();
        List<Integer> numbers3 = new Main().generateList(100000);
        long result7 = new Main().exercise6a(numbers3);

        long endTimeParallel = System.currentTimeMillis();


        List<Integer> numbers4 = new Main().generateList(100000);
        long startTimeSequential = System.currentTimeMillis();
        long result8 = new Main().exercise6b(numbers4);
        long endTimeSequential = System.currentTimeMillis();

        List<Course> courses = List.of(
            new Course(1, 5, 1, "Math"),
            new Course(2, 3, 1, "English"),
            new Course(3, 3, 2, "Physics"),
            new Course(4, 3, 2, "Chemistry"),
            new Course(5, 5, 3, "Biology"),
            new Course(6, 5, 3, "Biology"),
            new Course(7, 5, 3, "Biology"),
            new Course(8, 5, 3, "Biology"),
            new Course(9, 5, 3, "Biology"),
            new Course(10, 5, 3, "Biology"),
            new Course(11, 5, 3, "Biology")
        );
        List<Student> result9 = new Main().exercise7(students, courses);

        List<Student> result10 = new Main().exercise8(students, courses);

        Map<Integer, List<Integer>> result11 = new Main().exercise9(courses);

        List<Student> result12 = new Main().exercise10(students, "A");

        Map<String, List<String>> result13 = new Main().exercise11(students);

        System.out.println("Exercise 13: " + result13);
        System.out.println();
        System.out.println("Exercise 12: " + result12);
        System.out.println();
        System.out.println("Exercise 11: " + result11);
        System.out.println();
        System.out.println("Exercise 10: " + result10);
        System.out.println();
        System.out.println("Exercise 9: " + result9);
        System.out.println();
        System.out.println("Exercise 8: " + result8);
        System.out.println();
        System.out.println("Exercise 7: " + result7);
        System.out.println();
        System.out.println("Exercise 6: " + result6);
        System.out.println();
        System.out.println("Exercise 5: " + result5);
        System.out.println();
        System.out.println("Exercise 4: " + result4);
        System.out.println();
        System.out.println("Exercise 3: " + result3);
        System.out.println();
        System.out.println("Exercise 2: " + result2);
        System.out.println();
        System.out.println("Exercise 1: " + result);

        System.out.println("Execution time of parallel: " + (endTimeParallel - startTimeParallel) + " ms");
        System.out.println("Execution time of sequential: " + (endTimeSequential - startTimeSequential) + " ms");
    }
}