package napoje;

public abstract class Napoje {

    private final String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract void pij();
}