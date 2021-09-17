import java.util.Comparator;

public class ComparatorPersonVornameName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        /*
        // vornameComp = die Vornamen von beiden Personen werden verglichen und entweder negativerINT(Der erste Name kommt vorher im Alphabet),
         0(gleich) oder positiverINT(Der erste Name kommt als zweiter im Alphabet) wird geliefert. nameComp dann genauso.
         */
        int vornameComp = o1.getVorname().compareTo(o2.getVorname());
        int nameComp = o1.getName().compareTo(o2.getName());

        // wenn die Vornamen nicht gleich sind(also Null), dann vergleiche die Vornamen, sonst die Namen
        return (vornameComp != 0) ? vornameComp : nameComp;

    }
}
