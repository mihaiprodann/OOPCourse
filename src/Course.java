public class Course {
    //String name, enumeration Type (Foundamental, Specialization, Discipline), enumeration Stream (English, French, German), int creditPoints.
    private String name;

    public enum Type {
        FOUNDAMENTAL, SPECIALIZATION, DISCIPLINE
    }

    public enum Stream {
        ENGLISH, FRENCH, GERMAN
    }

    private int creditPoints;
}
