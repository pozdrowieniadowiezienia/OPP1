package napoje.impl;

import napoje.Napoje;

public class Woda extends Napoje {

    private String smak;

    public Woda(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;

    }

    @Override
    public void pij() {
        System.out.println("pije wode");
    }
}
