import java.util.Objects;

public abstract class Person {
    private String name, vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return getName() + ", " + getVorname();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Person)) return false;

        Person person = (Person) o;

        if(!Objects.equals(name, person.name)) return false;
        return Objects.equals(vorname, person.vorname);
    }


}
