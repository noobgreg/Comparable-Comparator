public class Student extends Person implements Comparable<Student> {

    private int matNr;

    public Student(String name, String vorname, int matNr) {
        super(name, vorname);
        this.matNr = matNr;
    }

    public int getMatrikel() {
        return matNr;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMatrikel();
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(matNr, other.matNr);
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Student)) return false;
        if(!super.equals(other)) return false;

        Student student = (Student) other;

        return matNr == student.matNr;
    }

}
