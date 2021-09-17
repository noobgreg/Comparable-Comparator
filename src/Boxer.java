public class Boxer extends Person implements Comparable<Boxer> {

    private int gewicht;

    public Boxer(String name, String vorname, int gewicht) {
        super(name, vorname);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }

    @Override
    public int compareTo(Boxer other) {
        int res = Integer.compare(gewicht, other.gewicht);
        if(res != 0) return res;

        res = getName().compareTo(other.getName());
        if(res != 0) return res;

        return getVorname().compareTo(other.getVorname());
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Boxer)) return false;
        if(!super.equals(other)) return false;

        Boxer boxer = (Boxer) other;

        return gewicht == boxer.gewicht;
    }
}
