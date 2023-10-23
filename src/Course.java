public class Course implements Comparable{
    private String name;



    public enum Type {
        FOUNDAMENTAL, SPECIALIZATION, DISCIPLINE
    }

    public enum Stream {
        ENGLISH, FRENCH, GERMAN
    }

    private Type type;
    private Stream stream;
    private int creditPoints;
    public Type getType() {
        return type;
    }

    public Stream getStream() {
        return stream;
    }

    public String getName() {
        return name;
    }

    public Course(String name, Type type, Stream stream, int creditPoints) {
        this.name = name;
        this.type = type;
        this.stream = stream;
        this.creditPoints = creditPoints;
    }

    @Override
    public int compareTo(Object o) {
        int streamComparison = this.getStream().compareTo(((Course) o).getStream());
        if (streamComparison == 0) {
            int typeComparison = this.getType().compareTo(((Course) o).getType());
            if (typeComparison == 0) {
                return this.getName().compareTo(((Course) o).getName());
            }
            return typeComparison;
        }
        return streamComparison;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", " + stream + ", " + creditPoints + " CP)";
    }
}
