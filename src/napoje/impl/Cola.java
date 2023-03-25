package napoje.impl;

import napoje.Napoje;

public class Cola extends Napoje {

    private String smak;

    public Cola(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;
    }

    @Override
    public void pij() {
        System.out.println("pije cole");
    }
}
